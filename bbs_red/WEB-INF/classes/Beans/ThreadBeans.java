package Beans;

public class ThreadBeans{
	
	private String threadUser;
	private String threadNo;
	private String threadTitle;
	private String threadRes;
	private String threadDate;

//==================================set method==================================	
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
	
	public void setThreadDate(String threadDate){
		this.threadDate = threadDate;
	}

//==================================get method==================================
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
	
	public String getThreadDate(){
		return threadDate;
	}
}