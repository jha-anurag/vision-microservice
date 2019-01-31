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
public class VisionServlet extends HttpServlet {
	
	private VisionManager visionManager;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		
		System.out.println("In doGet of VisionServlet, paths : " + req.getRequestURI() );
		
		if(req.getRequestURI().equals("/vision/start")) {
			resp.setStatus(HttpServletResponse.SC_OK);
			visionManager = new VisionManager();
			
			new Thread(visionManager).start();
			//visionManager.run();
		} 
		else if(req.getRequestURI().equals("/vision/stop")) {
			
			//visionManager.setKeepOn(false);
			visionManager.stop();
			resp.setStatus(HttpServletResponse.SC_OK);
		}
		
		
	}
	
	
	
	
	
}
