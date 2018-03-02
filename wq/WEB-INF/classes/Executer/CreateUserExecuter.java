package Executer;

import java.util.ArrayList;

import dba.dbAccessor;


public class CreateUserExecuter extends Executer{
	dbAccessor db = new dbAccessor();
	
	public void write(ArrayList ar,String aSql){}
	
	public void read(ArrayList ar,String bSql){}
	
	public boolean create(String sql){
		
		try {
			db.access();
			
			db.insert(sql);
			db.close();
			
			return true;
		}catch (Exception e){
			db.close();
			return false;
		}
	}
}