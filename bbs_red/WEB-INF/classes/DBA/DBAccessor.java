package DBA;

import java.util.ArrayList;
import java.sql.*;
import Beans.*;

public class DBAccessor{
	
	private static Connection conn = null;			//接続対象
	private static PreparedStatement st;			//SQL句
	private static ResultSet re = null;				//
	
//=======================================================Oracleに接続=======================================================
	public static void getConnection(){
		try{
			System.out.println("jdbcドライバの設置");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("connectOK");
			//ユーザー名とパスワードを指定して接続
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","info","pro");
			System.out.println("connect接続完了");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("connect接続失敗");
		}
	}
	
//======================================================アカウントを作成======================================================		
	public ArrayList<UserBeans> newUser(String name, String pass){
		
		ArrayList<UserBeans> aub = new ArrayList<UserBeans>();
		
		try{
			String sql = "SELECT user_no, user_name, user_password, user_manager FROM bbsuser";
			getConnection();
			System.out.println("creataccount ok");
			Statement st = conn.createStatement();
			
			ResultSet rs=st.executeQuery(sql);
			//st = conn.prepareStatement(sql);			//prepareの状態
			System.out.println("prepareStatementが終了");
			//re=st.executeQuery();					//実行select
			System.out.println("executeQueryが終了");
			
			while(rs.next()){
				UserBeans ubeans = new UserBeans();
				
				ubeans.setUserId(rs.getString(1));
				ubeans.setUserName(rs.getString(2));
				ubeans.setUserPass(rs.getString(3));
				ubeans.setUserKey(rs.getString(4));
				
				aub.add(ubeans);
			}
			System.out.println("newUserしたよ。");
			conn.commit();
			st.close();
			conn.close();
		}catch(SQLException e){
			System.out.println("newUserできませんでした。");
		}
		System.out.println("ここまでくれば多分newUserができる。");
		
		return aub;
	}

	
//======================================================Loginを作成======================================================		
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
			System.out.println("ResultSetを生成したよ");
			
		}catch(SQLException e){
			System.out.println("エラーコード"+e.getErrorCode());
		}
		return rs;
		
	}
	
	public void close(){
		try{
			conn.close();
		}catch(SQLException e){
		}
	}
	
//=======================================================Threadの閲覧=======================================================	
	public ArrayList<ThreadBeans> readThreads(){
		ArrayList<ThreadBeans> threadList = new ArrayList<ThreadBeans>();
		
		
		try{
			String sql="select thread_no,thread_title,thread_username,thread_date,thread_res from thread order by thread_no";		//select文oracleに入力
			getConnection();
			System.out.println("threadread接続した");
			Statement st=conn.createStatement();

			ResultSet rs=st.executeQuery(sql);
			//st = conn.prepareStatement(sql);			//prepareの状態
			System.out.println("prepareStatementが終了");
			//re=st.executeQuery();					//実行select
			System.out.println("executeQueryが終了");
			
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
			System.out.println("readThreadに追加したよ。");
			conn.commit();
			st.close();
			conn.close();
		}catch(SQLException e){
			System.out.println("readThreadできませんでした。");
		}
		System.out.println("ここまでくれば多分readThreadができる。");
		
		return threadList;
	}
	
	

//========================================================Resの閲覧========================================================	
	public ArrayList<ResBeans> readRes(String tn){
		
		ArrayList<ResBeans> resList = new ArrayList<ResBeans>();

		
		try{
			System.out.println("スレッドナンバー"+ tn);
			String sql="SELECT res_no, res_name, res_content, res_date from res WHERE thread_no = '"+tn+"' order by res_no";
			getConnection();
			System.out.println("readRes接続した");
			Statement st=conn.createStatement();

			ResultSet rs=st.executeQuery(sql);
			//st = conn.prepareStatement(sql);			//prepareの状態
			System.out.println("prepareStatementが終了");
			//re=st.executeQuery();					//実行select
			System.out.println("executeQueryが終了");
			
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
			System.out.println("resReadに追加したよ。");
			conn.commit();
			st.close();
			conn.close();
			
		}catch(SQLException e){
			System.out.println("resRead接続できませんでした。");
		}
		System.out.println("ここまでくればresReadができる。");
		
		
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
			System.out.println("write接続失敗");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("write接続失敗");
		}	
	}

}

