import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;
import java.sql.SQLException;

import Executer.CreateUserExecuter;

public class CreateUser extends HttpServlet {
		
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
		
		req.setCharacterEncoding("Windows-31J");
		
		CreateUserExecuter cue = new CreateUserExecuter();
		
		String userId = req.getParameter("user");
		String pass = req.getParameter("pass");
		String hn = req.getParameter("hn");
		
		boolean check;
		
		if (userId == null || userId.length() == 0 || pass == null || pass.length() == 0 || hn==null || hn.length()==0){
			 check = false;
		}else{
			String sql = "insert into users (userid, pass, hn) values ('"+a.SQLEscape(userId)+"', '"+a.SQLEscape(pass)+"','"+a.SQLEscape(hn)+"')";
			check= cue.create(sql);
		}
		
		if (check){
			RequestDispatcher dis = req.getRequestDispatcher("Login");
			dis.forward(req,res);
			
		}else{
			res.sendRedirect("nUser");
		}
	}
}