import java.io.IOException;

import javax.servlet.Request.Dispather;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServlet;

public class ResServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	
	throws IOException,ServletException{
		
		req.setCharacterEncoding("Windows-31J");
		
		RequsetDispatcher dispatcher=req.getRequestDispatcher("")
		
		dispather.forward(req,res);
	}
}
