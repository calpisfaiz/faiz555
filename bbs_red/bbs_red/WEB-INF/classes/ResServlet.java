import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.*;
import DBA.*;
import Execute.*;


public class ResServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException{
		req.setCharacterEncoding("Windows-31J");
		
		ArrayList user = new ArrayList();
		WriteResExecute wre = new WriteResExecute();
		ReadResExecute rre = new ReadResExecute();
		ResBeans rb = new ResBeans();
		//session
		HttpSession session = req.getSession();
		UserBeans ub = (UserBeans)session.getAttribute("loginUser");
		
		
		//Get Parameter
		//get thread no
		String no = req.getParameter("no");
		//get thread title
		String title = req.getParameter("title");
		//get thread user
		String tname = req.getParameter("username");
		//get thread date
		String tdate = req.getParameter("date");
		//get res username
		
		String resname;
		if(session.getAttribute("username")== null){
			resname = req.getParameter("User");
		}else{
			resname = (String)session.getAttribute("username");
		}
		//String resname = ub.getUserName();
		//get thread title
		String content = req.getParameter("Content");
		
		//set resBeans
		rb.setThreadNo(no);
		rb.setThreadTitle(title);
		rb.setThreadName(tname);
		rb.setThreadDate(tdate);
		rb.setUserName(resname);
		rb.setResContent(content);
		
		//writeRes
		wre.writeRes(rb);
				
		//setAttribute
		req.setAttribute("threadNo",no);
		req.setAttribute("threadTitle",title);
		req.setAttribute("threadUsername",tname);
		req.setAttribute("threadDate",tdate);
		
		//DBAccessor dba = new DBAccessor();	
		ArrayList<ResBeans> arb = rre.readRes(no);
		req.setAttribute("resView",arb);
		
		
		if(session.getAttribute("username") == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("ResView1");
			dispatcher.forward(req,res);
		}else{
			RequestDispatcher dispatcher = req.getRequestDispatcher("ResView");
			dispatcher.forward(req,res);
		}
		
	
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException{
		req.setCharacterEncoding("Windows-31J");
		
		
		HttpSession session = req.getSession();
		
		ReadResExecute rre = new ReadResExecute();
		
		//get parameter
		String no = req.getParameter("no");
		String title = req.getParameter("title");
		String tuser = req.getParameter("username");
		String tdate = req.getParameter("date");

		//setAttribute(��)
		req.setAttribute("threadNo",no);
		req.setAttribute("threadTitle",title);
		req.setAttribute("threadUsername",tuser);
		req.setAttribute("threadDate",tdate);
		
		//DBAccessor dba = new DBAccessor();	
		ArrayList<ResBeans> arb= rre.readRes(no);
		req.setAttribute("resView", arb);
		
		if(session.getAttribute("username") == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("ResView1");
			dispatcher.forward(req,res);
		}else{
			RequestDispatcher dispatcher = req.getRequestDispatcher("ResView");
			dispatcher.forward(req,res);
		}
	
	}

}