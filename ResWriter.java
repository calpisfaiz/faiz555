//Res�������݂̃T�[�u���b�g
import java.io*;

import javax.servlet*;

import javax.servlet.http*;

public void ResServlrt extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res);
	
	throws IOException,ServletException{
		
		rep.setContentType("text/html; charset=Shitft_JIS");
		PrintWriter out =res.getWriter();
		
		out.println("<html>");
		
		out.println("<head>");
		
		out.println("<title>�T���v��</title>");
		
		out.println("</head>");
		
		out.println("<body>");
		
		out.println("<p>ResWriter</p>");
		
		out.println("<p>���X�̏�������</p>");
		
		out.println("</body>");
		
		out.println("</html>");
		
		
		out.close();
	}
}
