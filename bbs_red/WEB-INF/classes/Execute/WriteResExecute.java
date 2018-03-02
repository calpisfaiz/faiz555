package Execute;

import Beans.*;
import DBA.*;

import java.util.ArrayList;

public class WriteResExecute{
	
	DBAccessor dba = new DBAccessor();

	public void writeRes(ResBeans rb){
		String sql;
		
		String resUserName = rb.getUserName();
		System.out.println("insert"+ rb.getThreadTitle()+""+rb.getThreadNo());
		
		if(resUserName == ""){
			sql = "INSERT INTO res(thread_no, res_no, res_content, res_date) VALUES ('"+rb.getThreadNo()+"', (select count(res_no) from res)+1,'"+rb.getResContent()+"', sysdate)";
		}else{
			sql = "INSERT INTO res(thread_no, res_no, res_name, res_content, res_date) VALUES ('"+rb.getThreadNo()+"',  (select count(res_no) from res)+1, '"+rb.getUserName()+"','"+rb.getResContent()+"', sysdate)";
		}
		System.out.println("res's insert OK!");
		
		dba.write(sql);
	
	}
}