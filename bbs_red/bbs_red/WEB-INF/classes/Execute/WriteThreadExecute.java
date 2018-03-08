package Execute;

import DBA.*;
import Beans.*;

public class WriteThreadExecute{
	DBAccessor dba = new DBAccessor();
	
	public void writeThread(ThreadBeans tb){
		String sql;
		
		String threadUser = tb.getThreadTitle();
		if(threadUser == ""){
			//create sequence
			sql = "INSERT INTO thread(thread_no, thread_title, thread_username, thread_date) values ((select count(thread_no) from thread)+1,'"+tb.getThreadTitle()+"', No Name, sysdate)";
		}else{
			sql = "INSERT INTO thread(thread_no, thread_title, thread_username, thread_date) values ((select count(thread_no) from thread)+1,'"+tb.getThreadTitle()+"','"+tb.getThreadUser()+"',sysdate)";
		}
		dba.write(sql);
		//dba.createSqe();
	}
}