/**
 * 
 */
package vision.service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author anuragjha
 *
 */
public class VisionStopServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		if(req.getRequestURI().equals("/vision/stop")) {
//			System.out.println("Closing Vision");
////			VisionServlet.visionManager.setKeepOn(false);
//			VisionServlet.visionManager.stop();
//			resp.setStatus(HttpServletResponse.SC_OK);
		}
	}
	

}
