package Execute;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.*;

import Beans.*;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpSession;

import DBA.DBAccessor;


public class LoginExecute{

	String aid;
	String apass;
	DBAccessor db = new DBAccessor();
	
		public boolean authUser(String id, String pass, HttpSession session){
		//�l�������Ă��邩�m�F
		if (id == null || id.length() == 0 || pass == null || pass.length() == 0){
			return false;
		}else{

			try {
				
				//�C���X�^���X��
				UserBeans u = new UserBeans();
				db.getConnection();
				String sql = "SELECT * FROM bbsuser WHERE user_name = '"+id+"' AND user_password = '"+pass+"'";
				//�P��� ResultSet �I�u�W�F�N�g��Ԃ�
				ResultSet rs = db.select(sql); 
				rs.next();
				u.setUserName(rs.getString(2));
				u.setUserPass(rs.getString(3));
				//u.setHn(rs.getString(3));
				//�Z�b�V�������g���l��set����
				session.setAttribute("user",u);
				session.setAttribute("username",u.getUserName());
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