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
import java.sql.*;

import Execute.*;
import Beans.*;
import DBA.*;


public class LoginServlet extends HttpServlet{
	String aid;
	String apass;
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws IOException,ServletException{
		req.setCharacterEncoding("Windows-31J");
		
		
		
		LoginExecute ule = new LoginExecute();
		//�G�X�P�[�v����getParameter�Ŏ󂯎��
		aid = a.SQLEscape(req.getParameter("username"));
		apass = a.SQLEscape(req.getParameter("userpassword"));
		//�Z�b�V�����̊J�n
		HttpSession session = req.getSession();
		//�f�[�^�x�[�X�Ƀ��[�U�F�؂ɐ��������ꍇ��true�A���s������false
		boolean check = ule.authUser(aid, apass, session);
		
		Boolean status = check;
		
		if (check){
			// �F�؍ς݂ɃZ�b�g 
			res.sendRedirect("ThreadServlet");
		}else{
			// �F�؂Ɏ��s������A���O�C����ʂɖ߂� */
				res.sendRedirect("reLogin");
		}
		
	}
}