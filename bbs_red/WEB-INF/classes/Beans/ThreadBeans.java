package Beans;
import Beans.ResBeans;

public class ThreadBeans{
	
	private ResBeans resbeans;
	
	private String threadUser;
	private String threadNo;
	private String threadTitle;
	private String threadRes;
	private String threadResCount;
	private String threadDate;

//==================================set method==================================	
	public void setResBean(ResBeans resbeans){
			this.resbeans = resbeans;
		}
	
	public void setThreadUser(String threadUser){
		this.threadUser = threadUser;
	}
	
	public void setThreadNo(String threadNo){
		this.threadNo = threadNo;
	}
	
	public void setThreadTitle(String threadTitle){
		this.threadTitle = threadTitle;
	}
	
	public void setThreadRes(String threadRes){
		this.threadRes = threadRes;
	}
	
	public void setResCount(String _threadResCount){
			this.threadResCount = _threadResCount;
		}
	
	public void setThreadDate(String threadDate){
		this.threadDate = threadDate;
	}

//==================================get method==================================
	public ResBeans getResBean(){
			return resbeans;
		}
	
	public String getThreadUser(){
		return threadUser;
	}
	
	public String getThreadNo(){
		return threadNo;
	}
	
	public String getThreadTitle(){
		return threadTitle;
	}
	
	public String getThreadRes(){
		return threadRes;
	}
	
	public String getResCount(){
			return threadResCount;
		}
	
	public String getThreadDate(){
		return threadDate;
	}
}