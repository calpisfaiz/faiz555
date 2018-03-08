package Beans;

public class UserBeans{
	
	private String userId;
	private String userName;
	private String userPass;
	private String userKey;
	
	
//==================================set method==================================	
	public void setUserId(String userId){
		this.userId = userId;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public void setUserPass(String userPass){
		this.userPass = userPass;
	}
	public void setUserKey(String userKey){
		this.userId = userKey;
	}
//==================================get method==================================	
	public String getUserId(){
		return userId;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public String getUserPass(){
		return userPass;
	}
	public String getUserKey(){
		return userKey;
	}

}