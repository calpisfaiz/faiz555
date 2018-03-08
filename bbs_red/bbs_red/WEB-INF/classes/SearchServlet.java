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


public class SearchServlet extends HttpServlet{
	

	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException{
		req.setCharacterEncoding("Windows-31J");
		
		ArrayList sa = new ArrayList();
		ThreadBeans tb = new ThreadBeans();
		DBAccessor dba = new DBAccessor();

		String search = req.getParameter("Search");
		String searchdata = req.getParameter("searchData");
		
		System.out.println(search);
		System.out.println(searchdata);
		ArrayList<ThreadBeans> atb= null;
		//ArrayList<ThreadBeans> atb = dba.searchNo(searchdata);
		//	req.setAttribute("threadView", atb);
	
		
		if(search.equals("No")){	
			atb=dba.searchNo(searchdata);
		}	
		if(search.equals("UserName")){			
			atb = dba.searchUserName(searchdata);
		}
		if(search.equals("Title")){
			atb = dba.searchTitle(searchdata);
		}
		req.setAttribute("threadView", atb);

		
		HttpSession session = req.getSession();
		if(session.getAttribute("username") == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("ThreadView1");
			dispatcher.forward(req,res);
		}else{
			RequestDispatcher dispatcher = req.getRequestDispatcher("ThreadView");
			dispatcher.forward(req,res);
		}
	}

}