package Execute;

import Beans.*;
import DBA.*;

import java.util.ArrayList;

public class CreateAccountExecute{
	public void createAccount(String name, String pass){
		
		String sql="INSERT INTO BBSUser(user_no, user_name, user_password, user_manager) values ((select count(user_no) from bbsuser)+1, '"+name+"', '"+pass+"', 2)";
	
		DBAccessor dba = new DBAccessor();
		dba.write(sql);
		
		//dba.newUser(name,pass);
		
	}
}