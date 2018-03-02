package Executer;

import java.util.ArrayList;

public abstract class Executer{
	public abstract void write(ArrayList ar,String inSql);
	
	public abstract void read(ArrayList ar,String seleSql);
		
}
