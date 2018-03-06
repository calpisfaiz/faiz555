import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Execute.LoginExecute;


public class LogoutServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		req.setCharacterEncoding("Windows-31J");
		
		//HttpSession session = req.getSession();
		//session.removeAttribute("user");
		
		req.getSession().invalidate();		//session cancel
		res.sendRedirect("Index");			//go to index
	}
}