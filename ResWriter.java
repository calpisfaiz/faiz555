//Res書き込みのサーブレット
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
		
		out.println("<title>サンプル</title>");
		
		out.println("</head>");
		
		out.println("<body>");
		
		out.println("<p>ResWriter</p>");
		
		out.println("<p>レスの書き込み</p>");
		
		out.println("</body>");
		
		out.println("</html>");
		
		
		out.close();
	}
}
