package dba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Date;


//import Bean.ResBean;
//import Bean.ThreadBean;

public class dbAccessor{
	
	
	Connection cn;
	
	public boolean access(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			cn = DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:orcl",
			"info","pro"
			);
			
			cn.setAutoCommit(false);
			
			return true;
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			return false;
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	
	public ResultSet select(String sql){
		int i = 0;
		
		ResultSet rs = null;
		
		try{
			PreparedStatement pSt = cn.prepareStatement(sql);
			rs = pSt.executeQuery();
			System.out.println("ResultSetを生成したよ");
			
		}catch(SQLException e){
			System.out.println("エラーコード"+e.getErrorCode());
		}
		
		
		return rs;
		
	}
	
	public void insert(String sql){
		
		try{
			Statement st = cn.createStatement();
			st.executeUpdate(sql);
			
			cn.commit();
		}catch(SQLException e){
			System.out.println("insertでerrorだよ");
			System.out.println("エラーコード"+e.getErrorCode());
		}
		
	}
	
	public void close(){
		try{
			cn.close();
		}catch(SQLException e){
		}
	}
}