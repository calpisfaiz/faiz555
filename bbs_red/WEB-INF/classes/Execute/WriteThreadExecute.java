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
			sql = "INSERT INTO thread(thread_no, thread_title, thread_date) values (threadsequence.nexval,'"+tb.getThreadTitle()+"',sysdate)";
		}else{
			sql = "INSERT INTO thread(thread_no, thread_title, thread_name, thread_date) values (threadsequence.nexval,'"+tb.getThreadTitle()+"','"+tb.getThreadUser()+"',sysdate)";
		}
		dba.write(sql);
		//dba.createSqe();
	}
}