package Execute;

import DBA.*;
import java.util.ArrayList;

public class ReadThreadExecute{
	
	DBAccessor dba = new DBAccessor();
	
	public ArrayList readThread(){
		ArrayList al = new ArrayList();
		al = dba.readThreads();
		return al;
	}
	
	
}