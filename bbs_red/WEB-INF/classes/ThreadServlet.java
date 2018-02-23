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



public class ThreadServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException{
		req.setCharacterEncoding("Windows-31J");
		
		ArrayList user = new ArrayList();
		ThreadBeans threadBean = new ThreadBeans();
		//WriteThreadExecute wte = new WriteThreadExecute();
		ReadThreadExecute rte = new ReadThreadExecute();
		
		String un=req.getParameter("thread_username");//thread_username
		String t=req.getParameter("thread_title");//thread_usertitle
		//String no=req.getParameter("thread_no");//thread_no
		//String re=req.getParameter("thread_res");//thread_usertitle
		
		threadBean.setThreadUser(un);
		threadBean.setThreadTitle(t);
		
		//wte.writeThread(threadBean);
		//user = rte.readThread();
		
		
		//wtb.setThreadNo(no);
		//wtb.setThreadRes(re);
		
		DBAccessor dba = new DBAccessor();
		dba.WriteThread(wtb);
		ArrayList<ThreadBeans> atb = dba.readThreads();
		
		
		req.setAttribute("threadView", atb);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("ThreadView");
		
		dispatcher.forward(req,res);
	
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException{
		doPost(req,res);
	}

}