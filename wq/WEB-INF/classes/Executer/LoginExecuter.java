package Executer;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.*;

import Bean.UserBean;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpSession;

import dba.dbAccessor;


public class LoginExecuter{

	String aid;
	String apass;
	dbAccessor db = new dbAccessor();
	
	public boolean authUser(String id, String pass, HttpSession session){
		//�l�������Ă��邩�m�F
		if (id == null || id.length() == 0 || pass == null || pass.length() == 0){
			return false;
		}else{

			try {
				//�C���X�^���X��
				UserBean u = new UserBean();
				db.access();
				String sql = "SELECT * FROM users WHERE userid = '"+id+"' AND pass = '"+pass+"'";
				//�P��� ResultSet �I�u�W�F�N�g��Ԃ�
				ResultSet rs = db.select(sql); 
				rs.next();
				u.setUserId(rs.getString(1));
				u.setPass(rs.getString(2));
				u.setHn(rs.getString(3));
				//�Z�b�V�������g���l��set����
				session.setAttribute("user",u);
				//����
				db.close();
	      		return true;
			}catch (SQLException e){
				db.close();
				return false;
			}catch(Exception e){
			 	db.close();
		 		return false;
			}
		} 
	}
	
}