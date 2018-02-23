import java.io.IOException;
import Beans.*;
import DBA.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;

public class WriteThreadServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException{

		req.setCharacterEncoding("Windows-31J");
			String u=req.getParameter("thread_username");//‹àŠz
			String t=req.getParameter("thread_title");//“ú•t
			String d=req.getParameter("thread_date");//Žg—p—p“r
			


			
			ThreadBeans tb = new ThreadBeans();
			tb.setThreadUser(u);
			tb.setThreadTitle(t);
			tb.setThreadDate(d);


			DBAccessor dba=new DBAccessor();
			//oa.dataUpdate(tb);
			ArrayList<ThreadBeans> threadList=dba.readThreads();
			//ThreadBeans stb =dba.allSelectSumMoney();
			req.setAttribute("threadView",threadList);
			//req.setAttribute("sum",smb);

			RequestDispatcher dispatcher=req.getRequestDispatcher("ThreadView.jsp");

		dispatcher.forward(req,res);
	}
}
