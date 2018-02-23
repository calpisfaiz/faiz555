import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class CreateAccountServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException{
		req.setCharacterEncoding("Windows-31J");
		
		public String createAccount(String id, String pass){
			DBAccessor DBA = new DBAccessor();
			DBA.createConnection();

			return DBA.addUser(id, pass);
		}
		
		req.setAttribute("newAccount", createAccount(req.getParameter("id"), req.getParameter("pass")));
		
		RequestDispatcher rd = req.getRequestDispatcher("threadView.jsp");
		rd.forward(req,res);
		
	}
}