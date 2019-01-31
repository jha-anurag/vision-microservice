/**
 * 
 */
package project;

import vision.service.VisionServlet;
import vision.service.VisionStopServlet;

/**
 * @author anuragjha
 *
 */
public class VisionService {

	/**
	 * 
	 */
	public VisionService() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		V1JettyServer server = new V1JettyServer(9001);
		server.initialize();
		server.addMapping(VisionServlet.class, "/vision/*");
		//server.addMapping(VisionServlet.class, "/vision/start");
		//server.addMapping(VisionStopServlet.class, "/vision/stop");
		
		server.start();
		System.out.println("Vision Server Started");

	}

}
