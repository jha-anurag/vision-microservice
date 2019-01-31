/**
 * 
 */
package httpServletUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.http.HttpServletRequest;

/**
 * @author anuragjha
 *
 */
public class HttpServletRequestUtil {

	public String readBody(HttpServletRequest req) {
		int contentLength = req.getContentLength();
		byte[] bytes = new byte[contentLength];
		int read = 0;
		while(read < contentLength) {
			try {
				read += req.getInputStream().read(bytes, read, (bytes.length-read));
				
			} catch (IOException e) {
				System.out.println("Error in getting inputStream");
				e.printStackTrace();
			}
		}
		//convert request Body byte array to string
		return new String(bytes, StandardCharsets.UTF_8);
	}
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
