import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Execute.*;

public class RegisterServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		req.setCharacterEncoding("Windows-31J");
		
		String name = req.getParameter("newname");
		String pass = req.getParameter("newpassword");
		
		CreateAccountExecute cae = new CreateAccountExecute();
		cae.createAccount(name,pass);
		

		RequestDispatcher rd = req.getRequestDispatcher("Index.jsp");
		rd.forward(req,res);
	}
}