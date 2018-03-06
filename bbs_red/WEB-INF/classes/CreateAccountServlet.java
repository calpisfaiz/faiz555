import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Execute.*;
import Beans.*;


public class CreateAccountServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException{
		req.setCharacterEncoding("Windows-31J");

		RequestDispatcher dispatcher = req.getRequestDispatcher("ThreadView");
		
		dispatcher.forward(req,res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException{
		req.setCharacterEncoding("Windows-31J");
		
		CreateAccountExecute cae = new CreateAccountExecute();
		
		String name = req.getParameter("newname");
		String pass = req.getParameter("newpassword");
		
		UserBeans ub = new UserBeans();
		ub.setUserName(name);
		ub.setUserPass(pass);
		
		cae.createAccount(name,pass);
		RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
		rd.forward(req,res);
		
		
	}
}
	