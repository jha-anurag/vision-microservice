/**
 * 
 */
package httpServletUtil;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

/**
 * @author anuragjha
 *
 */
public class HttpServletResponseUtil {


	/**
	 * 
	 * @param resp
	 * @param result
	 */
	public void writeOKResponse(HttpServletResponse resp, String result) {
		try {
			resp.setStatus(HttpServletResponse.SC_OK);

			resp.setContentType("application/json");
			resp.setCharacterEncoding("UTF-8");
			resp.setContentLength(result.getBytes().length);
			
			resp.getWriter().println(result);
			resp.getWriter().flush();
			resp.getWriter().close();
			
			System.out.println("result : respBody : " + result);
		} catch (IOException e) {
			System.out.println("Error in writing response");
			e.printStackTrace();
		}

	}
	
	
	/**
	 * 
	 * @param resp
	 * @param result
	 */
	public void writeOKHTMLResponse(HttpServletResponse resp, String result) {
		try {
			resp.setStatus(HttpServletResponse.SC_OK);

			resp.setContentType("text/html");
			resp.setCharacterEncoding("UTF-8");
			resp.setContentLength(result.getBytes().length);
			
			resp.getWriter().println(result);
			resp.getWriter().flush();
			resp.getWriter().close();

		} catch (IOException e) {
			System.out.println("Error in writing response");
			e.printStackTrace();
		}

	}
	
	
	/**
	 * 
	 * @param resp
	 * @param result
	 */
	public void write400Response(HttpServletResponse resp) {
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	}



}
