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
			System.out.println("ここOK");
			//ユーザー名とパスワードを指定して接続
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","info","pro");
			System.out.println("接続完了");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("接続失敗");
		}
	}
//======================================================アカウントを作成======================================================		
	public ArrayList<UserBeans> newUser(){
		ArrayList<UserBeans> beanList = new ArrayList<UserBeans>();
		return beanList;
	}
	
//=======================================================Threadの閲覧=======================================================	
	public ArrayList<ThreadBeans> readThreads(){
		ArrayList<ThreadBeans> threadList = new ArrayList<ThreadBeans>();
		
		
		try{
			String sql="select thread_no,thread_title,thread_username,thread_date,(select count(RES_NO) from Res) from thread";		//select文oracleに入力
			getConnection();
			System.out.println("接続した");
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
				
				threadList.add(tbeans);
			}
			System.out.println("リストに追加したよ。");
			conn.commit();
		}catch(SQLException e){
			System.out.println("接続できませんでした。");
		}
		System.out.println("ここまでくれば多分beansListが返される。");
		
		
		return threadList;
	}
	
	

//========================================================Resの閲覧========================================================	
	public ArrayList<ResBeans> readRes(String tn){
		
		ArrayList<ResBeans> resList = new ArrayList<ResBeans>();

		
		try{
			System.out.println("スレッドナンバー"+ tn);
			//String tsql="SELECT thread_no,thread_title,thread_username,thread_date,(SELECT count(RES_NO) FROM Res) FROM thread";		//select文oracleに入力
			String sql="SELECT res_no, res_name, res_content, res_date,(SELECT thread_username FROM thread WHERE thread_no = '"+tn+"'),(SELECT thread_title FROM thread WHERE thread_no = '"+tn+"'),(SELECT thread_date FROM thread WHERE thread_no = '"+tn+"')from res";
			getConnection();
			System.out.println("接続した");
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
				rbeans.setThreadName(rs.getString(5));
				rbeans.setThreadTitle(rs.getString(6));
				rbeans.setThreadDate(rs.getString(7));
				
				resList.add(rbeans);
			}
			System.out.println("threadリストに追加したよ。");
			conn.commit();
		}catch(SQLException e){
			System.out.println("接続できませんでした。");
		}
		System.out.println("ここまでくれば多分beansListが返される。");
		
		
		return resList;
	}
	
//=======================================================Threadの投稿=======================================================	
	public ArrayList<ThreadBeans> WriteThread(ThreadBeans tb){
		//DBAccess dba = new DBAccess();
		ArrayList<ThreadBeans> tbList = new ArrayList<ThreadBeans>();
		
		getConnection();
		
		try{
			System.out.println("接続した後");
			
			st=conn.prepareStatement("INSERT INTO thread(thread_no,thread_username,thread_title,thread_res) values (threadsequence.nexval,?,?,sysdate)");			//為輸入SQL但未按ENTER的状態
			System.out.println("prepareStatementが終了");
			//st.setString(1,tb.getThreadNo());
			st.setString(1,tb.getThreadUser());
			st.setString(2,tb.getThreadTitle());
			//st.setString(4,tb.getThreadRes());

			st.executeUpdate();
			System.out.println("executeQueryが終了");

		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println("ここまでくれば多分beansListが更新される。");
		return tbList;									//selectした結果入れたbeanを返す
	}


//=======================================================Resの投稿=======================================================		
	public ArrayList<ResBeans> WriteRes(ResBeans rb){
			ArrayList<ResBeans> resList = new ArrayList<ResBeans>();
		
		getConnection();
		
		try{
			System.out.println("接続した後");
			
			st=conn.prepareStatement("INSERT INTO thread(thread_no,res_no,res_name,res_content) values (?,?,?,?)");			//為輸入SQL但未按ENTER的状態
			System.out.println("prepareStatementが終了");
			st.setString(1,rb.getThreadNo());
			st.setString(2,rb.getResNo());
			st.setString(3,rb.getUserName());
			st.setString(4,rb.getResContent());

			st.executeUpdate();
			System.out.println("executeQueryが終了");

		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println("ここまでくれば多分beansListが更新される。");
		return resList;									//selectした結果入れたbeanを返す
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
			System.out.println("接続失敗");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("接続失敗");
		}	
	}
*/
}

