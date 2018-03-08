package Beans;

public class ResBeans{
	
	private String threadNo;
	private String threadName;
	private String threadTitle;
	private String threadDate;
	
	
	private String resNo;
	private String resContent;
	private String resDate;
	private String userName;
	

//==================================set method==================================	
	public void setThreadNo(String threadNo){
		this.threadNo = threadNo;
	}
	public void setThreadName(String threadName){
		this.threadName = threadName;
	}
	public void setThreadTitle(String threadTitle){
		this.threadTitle = threadTitle;
	}
	public void setThreadDate(String threadDate){
		this.threadDate = threadDate;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public void setResNo(String resNo){
		this.resNo = resNo;
	}
		
	public void setResContent(String resContent){
		this.resContent = resContent;
	}
	
	public void setResDate(String resDate){
		this.resDate = resDate;
	}

//==================================get method==================================
	public String getThreadNo(){
		return threadNo;
	}
	
	public String getThreadName(){
		return threadName;
	}
	
	public String getThreadTitle(){
		return threadTitle;
	}
	
	public String getThreadDate(){
		return threadDate;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public String getResNo(){
		return resNo;
	}
		
	public String getResContent(){
		return resContent;
	}
	
	public String getResDate(){
		return resDate;
	}
}