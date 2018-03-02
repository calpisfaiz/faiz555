package Bean;

import java.util.ArrayList;

public class ThreadBean implements Bean{
	private String tId;
	private String tName;
	private ArrayList<ResBean> resArray = new ArrayList<ResBean>();
	private String category;
	private String tTime;
	private int tComment;
	private int page;
	private String backGroundImage;
	//setter
	
	public void setTId(String tId){
		this.tId = tId;
	}
	
	
	public void setTName(String tName){
		this.tName = tName;
	}
	
	public void setCategory(String cateory){
		this.category = category;
	}
	
	public void setResArray(ResBean res){
		resArray.add(res);
	}
	
	public void setTTime(String tTime){
		this.tTime=tTime;
	}
	
	public void setTComment(int tcomment){
		this.tComment=tComment;
	}
	
	public void setPage(int page){
		this.page=page;
	}
	
	public void setBackGroundImage(String backGroundImage){
		this.backGroundImage=backGroundImage;
	}
	
	//getter
	
	public String getTId(){
		return tId;
	}
	
	public String getTName(){
		return tName;
	}
	
	public String getCategory(){
		return category;
	}
	
	public ArrayList getResArray(){
		return resArray;
	}
	
	public String getTTime(){
		return tTime;
	}
	
	public int getTComment(){
		return tComment;
	}
	
	public int getPage(){
		return page;
	}
	
	public String getBackGroundImage(){
		return backGroundImage;
	}
}
