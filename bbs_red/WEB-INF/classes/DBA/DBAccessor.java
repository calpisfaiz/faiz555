package DBA;

import java.util.ArrayList;
import java.sql.*;
import Beans.*;

public class DBAccessor{
	
	private static Connection conn = null;			//�ڑ��Ώ�
	private static PreparedStatement st;			//SQL��
	private static ResultSet re = null;				//
	
//=======================================================Oracle�ɐڑ�=======================================================
	public static void getConnection(){
		try{
			System.out.println("jdbc�h���C�o�̐ݒu");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("connectOK");
			//���[�U�[���ƃp�X���[�h���w�肵�Đڑ�
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","info","pro");
			System.out.println("connect�ڑ�����");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("connect�ڑ����s");
		}
	}
	
//======================================================�A�J�E���g���쐬======================================================		
	public ArrayList<UserBeans> newUser(String name, String pass){
		
		ArrayList<UserBeans> aub = new ArrayList<UserBeans>();
		
		try{
			String sql = "SELECT user_no, user_name, user_password, user_manager FROM bbsuser";
			getConnection();
			System.out.println("creataccount ok");
			Statement st = conn.createStatement();
			
			ResultSet rs=st.executeQuery(sql);
			//st = conn.prepareStatement(sql);			//prepare�̏��
			System.out.println("prepareStatement���I��");
			//re=st.executeQuery();					//���sselect
			System.out.println("executeQuery���I��");
			
			while(rs.next()){
				UserBeans ubeans = new UserBeans();
				
				ubeans.setUserId(rs.getString(1));
				ubeans.setUserName(rs.getString(2));
				ubeans.setUserPass(rs.getString(3));
				ubeans.setUserKey(rs.getString(4));
				
				aub.add(ubeans);
			}
			System.out.println("newUser������B");
			conn.commit();
			st.close();
			conn.close();
		}catch(SQLException e){
			System.out.println("newUser�ł��܂���ł����B");
		}
		System.out.println("�����܂ł���Α���newUser���ł���B");
		
		return aub;
	}

	
//======================================================Login���쐬======================================================		
	public ArrayList userListRe(){
    String sql = "SELECT user_name, user_password FROM bbsuser";
    ArrayList<UserBeans> userBeanList = new ArrayList<UserBeans>();
    try{
      	getConnection();
	    Statement st = conn.createStatement();
	    ResultSet rs = st.executeQuery(sql);

	    while(rs.next()){
	    	UserBeans ub = new UserBeans();
	    	ub.setUserName(rs.getString(1));
	    	ub.setUserPass(rs.getString(2));
	    	userBeanList.add(ub);

        System.out.println(rs.getString(2));
	    }

  	}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
  	return userBeanList;
  }

	public ResultSet select(String sql){
		int i = 0;
		
		ResultSet rs = null;
		
		try{
			PreparedStatement pSt = conn.prepareStatement(sql);
			rs = pSt.executeQuery();
			System.out.println("ResultSet�𐶐�������");
			
		}catch(SQLException e){
			System.out.println("�G���[�R�[�h"+e.getErrorCode());
		}
		return rs;
		
	}
	
	public void close(){
		try{
			conn.close();
		}catch(SQLException e){
		}
	}
	
//=======================================================Thread�̉{��=======================================================	
	public ArrayList<ThreadBeans> readThreads(){
		ArrayList<ThreadBeans> threadList = new ArrayList<ThreadBeans>();
		
		
		try{
			String sql="select thread_no,thread_title,thread_username,thread_date,thread_res from thread order by thread_no";		//select��oracle�ɓ���
			getConnection();
			System.out.println("threadread�ڑ�����");
			Statement st=conn.createStatement();

			ResultSet rs=st.executeQuery(sql);
			//st = conn.prepareStatement(sql);			//prepare�̏��
			System.out.println("prepareStatement���I��");
			//re=st.executeQuery();					//���sselect
			System.out.println("executeQuery���I��");
			
			while(rs.next()){
				ThreadBeans tbeans = new ThreadBeans();
				
				tbeans.setThreadNo(rs.getString(1));
				tbeans.setThreadTitle(rs.getString(2));
				tbeans.setThreadUser(rs.getString(3));
				tbeans.setThreadDate(rs.getString(4));
				tbeans.setThreadRes(rs.getString(5));
				//System.out.println("OK");
				
				threadList.add(tbeans);
			}
			System.out.println("readThread�ɒǉ�������B");
			conn.commit();
			st.close();
			conn.close();
		}catch(SQLException e){
			System.out.println("readThread�ł��܂���ł����B");
		}
		System.out.println("�����܂ł���Α���readThread���ł���B");
		
		return threadList;
	}
	
	

//========================================================Res�̉{��========================================================	
	public ArrayList<ResBeans> readRes(String tn){
		
		ArrayList<ResBeans> resList = new ArrayList<ResBeans>();

		
		try{
			System.out.println("�X���b�h�i���o�["+ tn);
			String sql="SELECT res_no, res_name, res_content, res_date from res WHERE thread_no = '"+tn+"' order by res_no";
			getConnection();
			System.out.println("readRes�ڑ�����");
			Statement st=conn.createStatement();

			ResultSet rs=st.executeQuery(sql);
			//st = conn.prepareStatement(sql);			//prepare�̏��
			System.out.println("prepareStatement���I��");
			//re=st.executeQuery();					//���sselect
			System.out.println("executeQuery���I��");
			
			while(rs.next()){

				ResBeans rbeans = new ResBeans();
				
				rbeans.setResNo(rs.getString(1));
				rbeans.setUserName(rs.getString(2));
				rbeans.setResContent(rs.getString(3));
				rbeans.setResDate(rs.getString(4));
				//rbeans.setThreadName(rs.getString(5));
				//rbeans.setThreadTitle(rs.getString(6));
				//rbeans.setThreadDate(rs.getString(7));
				
				resList.add(rbeans);
			}
			System.out.println("resRead�ɒǉ�������B");
			conn.commit();
			st.close();
			conn.close();
			
		}catch(SQLException e){
			System.out.println("resRead�ڑ��ł��܂���ł����B");
		}
		System.out.println("�����܂ł����resRead���ł���B");
		
		
		return resList;
	}
	

//=======================================================Write=======================================================		
	public void write(String sql){
		
		try{
			getConnection();
			
			Statement st=conn.createStatement();
			st.executeUpdate(sql);
			
			conn.commit();
			st.close();
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("write�ڑ����s");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("write�ڑ����s");
		}	
	}

}

