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
			System.out.println("����OK");
			//���[�U�[���ƃp�X���[�h���w�肵�Đڑ�
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","info","pro");
			System.out.println("�ڑ�����");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("�ڑ����s");
		}
	}
//======================================================�A�J�E���g���쐬======================================================		
	public ArrayList<UserBeans> newUser(){
		ArrayList<UserBeans> beanList = new ArrayList<UserBeans>();
		return beanList;
	}
	
//=======================================================Thread�̉{��=======================================================	
	public ArrayList<ThreadBeans> readThreads(){
		ArrayList<ThreadBeans> threadList = new ArrayList<ThreadBeans>();
		
		
		try{
			String sql="select thread_no,thread_title,thread_username,thread_date,(select count(RES_NO) from Res) from thread";		//select��oracle�ɓ���
			getConnection();
			System.out.println("�ڑ�����");
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
				
				threadList.add(tbeans);
			}
			System.out.println("���X�g�ɒǉ�������B");
			conn.commit();
		}catch(SQLException e){
			System.out.println("�ڑ��ł��܂���ł����B");
		}
		System.out.println("�����܂ł���Α���beansList���Ԃ����B");
		
		
		return threadList;
	}
	
	

//========================================================Res�̉{��========================================================	
	public ArrayList<ResBeans> readRes(String tn){
		
		ArrayList<ResBeans> resList = new ArrayList<ResBeans>();

		
		try{
			System.out.println("�X���b�h�i���o�["+ tn);
			//String tsql="SELECT thread_no,thread_title,thread_username,thread_date,(SELECT count(RES_NO) FROM Res) FROM thread";		//select��oracle�ɓ���
			String sql="SELECT res_no, res_name, res_content, res_date,(SELECT thread_username FROM thread WHERE thread_no = '"+tn+"'),(SELECT thread_title FROM thread WHERE thread_no = '"+tn+"'),(SELECT thread_date FROM thread WHERE thread_no = '"+tn+"')from res";
			getConnection();
			System.out.println("�ڑ�����");
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
				rbeans.setThreadName(rs.getString(5));
				rbeans.setThreadTitle(rs.getString(6));
				rbeans.setThreadDate(rs.getString(7));
				
				resList.add(rbeans);
			}
			System.out.println("thread���X�g�ɒǉ�������B");
			conn.commit();
		}catch(SQLException e){
			System.out.println("�ڑ��ł��܂���ł����B");
		}
		System.out.println("�����܂ł���Α���beansList���Ԃ����B");
		
		
		return resList;
	}
	
//=======================================================Thread�̓��e=======================================================	
	public ArrayList<ThreadBeans> WriteThread(ThreadBeans tb){
		//DBAccess dba = new DBAccess();
		ArrayList<ThreadBeans> tbList = new ArrayList<ThreadBeans>();
		
		getConnection();
		
		try{
			System.out.println("�ڑ�������");
			
			st=conn.prepareStatement("INSERT INTO thread(thread_no,thread_username,thread_title,thread_res) values (threadsequence.nexval,?,?,sysdate)");			//�חA��SQL�A����ENTER�I���
			System.out.println("prepareStatement���I��");
			//st.setString(1,tb.getThreadNo());
			st.setString(1,tb.getThreadUser());
			st.setString(2,tb.getThreadTitle());
			//st.setString(4,tb.getThreadRes());

			st.executeUpdate();
			System.out.println("executeQuery���I��");

		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println("�����܂ł���Α���beansList���X�V�����B");
		return tbList;									//select�������ʓ��ꂽbean��Ԃ�
	}


//=======================================================Res�̓��e=======================================================		
	public ArrayList<ResBeans> WriteRes(ResBeans rb){
			ArrayList<ResBeans> resList = new ArrayList<ResBeans>();
		
		getConnection();
		
		try{
			System.out.println("�ڑ�������");
			
			st=conn.prepareStatement("INSERT INTO thread(thread_no,res_no,res_name,res_content) values (?,?,?,?)");			//�חA��SQL�A����ENTER�I���
			System.out.println("prepareStatement���I��");
			st.setString(1,rb.getThreadNo());
			st.setString(2,rb.getResNo());
			st.setString(3,rb.getUserName());
			st.setString(4,rb.getResContent());

			st.executeUpdate();
			System.out.println("executeQuery���I��");

		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println("�����܂ł���Α���beansList���X�V�����B");
		return resList;									//select�������ʓ��ꂽbean��Ԃ�
	}

	
//=======================================================Write=======================================================		
/*	public void write(String sql){
		
		try{
			getConnection();
			
			Statement st=conn.createStatement();
			int result = st.executeUpdate(sql);
			System.out.println(result+"insert over");
			
			conn.commit();
			st.close();
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("�ڑ����s");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("�ڑ����s");
		}	
	}
*/
}

