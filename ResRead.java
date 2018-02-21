//読み込みのResのサーブレット
package filters;

import javax.servlet.Filter;

public class SetCharacterEncodingFilter implements Filter{
	
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)
	
	throwa IOException,ServletException{
		
		if(ignore ||(req.getCharacterEncoding() ==null)){
			
			String encoding = selectEncoding(req);
			
			if(encoding != null)
			
			req.setCharacterEncoding(encoding);
		}
		
		chain.doFilter(req,res);
	}
}
