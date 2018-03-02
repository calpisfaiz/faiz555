package Bean;

import java.io.Serializable;

public class UserBean implements Serializable{
	private String userId;
	private String pass;
	private String hn;
	private String iconImage;
	//setter
	
	public void setUserId(String userId){
		this.userId=userId;
	}
	
	public void setPass(String pass){
		this.pass=pass;
	}
	
	public void setHn(String hn){
		this.hn=hn;
	}
	
	public void setIconImage(String iconImage){
		this.iconImage=iconImage;
	}
	
	//gettter
	public String getUserId(){
		return userId;
	}
	
	public String getPass(){
		return pass;
	}
	
	public String getHn(){
		return hn;
	}
	
	public String getIconImage(){
		return iconImage;
	}
}