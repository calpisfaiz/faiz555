//import java.io.*;

//import javax.servlet.*;

//import javax.servlet.http.*;
import java.io.IOException;

import javax.ServletException;

import javax.HttpServletRequest;

import javax.HttpServletResponse;

import javax.http.HttpServlet;

public class ResServlet extends HttpServlet{
	
	ServletContext sc; //�����o�ϐ�
	ResBeans resbean;//��Œǉ� ResBean�Ɍ�ŕύX
	
	public void int(ServletConfing config) //������
	throws SerletExcption
	{
		super.int(confing);
		
		sc = getServletContext();
		
		String dataPath = confing.getInitParameter("datapath");
		
		if(dataPath == null){
			
			dataPath ="";
			
		}
		
		
		resbean = (ResBeans)res.getAttribute("resmanager");//bbsManager��Œǉ�
		if(resManager ==null){
			resManager = new ResManagerBeas(dataPath);
			sc.setAttribute("resmanager",resManager);
	}
	
}
//post���\�b�h
	public void doPost(HttpServletRequest req,HttpServletresponse res)
	throws IOException, ServletExcption
	{
	doGet(req.res);
	}

//get���\�b�h
	public void doGet(HttpServletrequest req,HttpServletrepones res)
		throws IOException,ServletException
	{
		BBSDataBeans bbsData = new BBSDataBeans();
		String data =req.getParameter("function");
	
	//if(data == null){
		
	//}
	
	//else if(data.compareTo("WRITE") == 0){ //��������
	
	//Write(req,res,Data);
	//}

	//else if(data.comparareTo("DELETE") == 0){ //�폜
	//	Delete(req,res,Data);
	//}
	
	
	//req.setAttribute("data",Data);
	
	//sc.getRequestDispatcher("/.jsp").forward(req,res);//jsp�t�@�C��
	//}
	
	//.DeleteItem(index,password);
	
	//.ReadArticles(0,Data);
//}

//���b�Z�[�W���e

//public void Write(HttpServletRequest req,HttpServletRespones res)

//throws IOException,ServletException
//{
	
	//BBSItem Item = new BBSItem();
	
	//item.name =KanjiConv.ConvJStr(req.getParameter("name"));
	
	//if(item.name == null)
	
	//item.name ="";
	
	//item,email =KanjiConv.ConvJStr(req.getParameter("email"));
	
	//if(item.email == null)
	
	//item.content ="";
	
	//item.emaiol =kanjiConv.ConvJStr(req.getParameter("content"));
	
	//if(item.content == null)
	
	//item.content ="";
	
	//item.deleteKey =KanjiConv.ConvJStr(req.getParameter("pass"));
	
	//if(item.content == null)
	
	//item.pass ="";
	
	//bbsManager.AddItem(item);
	//bbsMnager.RreadArticles(0,bbsData);
//}


//�ǂݏo��

//public void SRead(HttpSrvletRequest req,HttpServletRespones res)

//throws IOExcepion,ServletException
//{
	
	//int nidex,lastIndex;
	
	//String strIndex =req.getParameter("index");
	
	//if(strIndex ! = null){
		
		//index =Integer.paseInt(strIndex);
	//}
	
	//}else{
		
		//index = 0;
		
	//}
	
	//bbsManager.ReadArticles(index,bbsData);
	//}

	//public void destroy()
//{
	}
}