//import java.io.*;

//import javax.servlet.*;

//import javax.servlet.http.*;
import java.io.IOException;

import javax.ServletException;

import javax.HttpServletRequest;

import javax.HttpServletResponse;

import javax.http.HttpServlet;

public class ResServlet extends HttpServlet{
	
	ServletContext sc; //メンバ変数
	ResBeans resbean;//後で追加 ResBeanに後で変更
	
	public void int(ServletConfing config) //初期化
	throws SerletExcption
	{
		super.int(confing);
		
		sc = getServletContext();
		
		String dataPath = confing.getInitParameter("datapath");
		
		if(dataPath == null){
			
			dataPath ="";
			
		}
		
		
		resbean = (ResBeans)res.getAttribute("resmanager");//bbsManager後で追加
		if(resManager ==null){
			resManager = new ResManagerBeas(dataPath);
			sc.setAttribute("resmanager",resManager);
	}
	
}
//postメソッド
	public void doPost(HttpServletRequest req,HttpServletresponse res)
	throws IOException, ServletExcption
	{
	doGet(req.res);
	}

//getメソッド
	public void doGet(HttpServletrequest req,HttpServletrepones res)
		throws IOException,ServletException
	{
		BBSDataBeans bbsData = new BBSDataBeans();
		String data =req.getParameter("function");
	
	//if(data == null){
		
	//}
	
	//else if(data.compareTo("WRITE") == 0){ //書き込み
	
	//Write(req,res,Data);
	//}

	//else if(data.comparareTo("DELETE") == 0){ //削除
	//	Delete(req,res,Data);
	//}
	
	
	//req.setAttribute("data",Data);
	
	//sc.getRequestDispatcher("/.jsp").forward(req,res);//jspファイル
	//}
	
	//.DeleteItem(index,password);
	
	//.ReadArticles(0,Data);
//}

//メッセージ投稿

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


//読み出し

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