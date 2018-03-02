

public class a{
	public static String subStitute(String input,String pattern,String replacement){
		int index = input.indexOf(pattern);
		
		if(index == -1){
			return input;
		}
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(input.substring(0,index) + replacement);
		if(index + pattern.length() < input.length()){
			String rest = input.substring(index + pattern.length(),input.length());
			buffer.append(subStitute(rest,pattern,replacement));
		}
		
		return buffer.toString();
	}
	
	
	public static String SQLEscape(String input){
		input = subStitute(input,"'","''");
		input = subStitute(input,"\\","\\\\");
		
		return input;
	}
}