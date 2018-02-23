package Execute;

import Beans.*;
import DBA.*;

import java.util.ArrayList;

public class ReadResExecute{
	
	DBAccessor dba = new DBAccessor();

	public ArrayList readRes(String _id){
		String id = _id;
		
		return dba.readRes(id);
		
	}
}