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
		//�G�X�P�[�v����getParameter�Ŏ󂯎��
		aid = a.SQLEscape(req.getParameter("aid"));
		apass = a.SQLEscape(req.getParameter("apass"));
		//�Z�b�V�����̊J�n
		HttpSession session = req.getSession();
		//�f�[�^�x�[�X�Ƀ��[�U�F�؂ɐ��������ꍇ��true�A���s������false
		boolean check = ule.authUser(aid, apass, session);
		
		Boolean status = check;
		
		if (check){
			// �F�؍ς݂ɃZ�b�g 
			res.sendRedirect("Login");
		}else{
			// �F�؂Ɏ��s������A���O�C����ʂɖ߂� */
				res.sendRedirect("reLogin");
		}
		
	}
}