import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Executer.LoginExecuter;


public class Login extends HttpServlet{
	String aid;
	String apass;
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		req.setCharacterEncoding("Windows-31J");
		
		
		
		LoginExecuter ule = new LoginExecuter();
		//エスケープしてgetParameterで受け取る
		aid = a.SQLEscape(req.getParameter("aid"));
		apass = a.SQLEscape(req.getParameter("apass"));
		//セッションの開始
		HttpSession session = req.getSession();
		//データベースにユーザ認証に成功した場合はtrue、失敗したらfalse
		boolean check = ule.authUser(aid, apass, session);
		
		Boolean status = check;
		
		if (check){
			// 認証済みにセット 
			res.sendRedirect("Login");
		}else{
			// 認証に失敗したら、ログイン画面に戻す */
				res.sendRedirect("reLogin");
		}
		
	}
}