/**
 * 
 */
package project;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

/**
 * @author anuragjha
 *
 */
public class V1JettyServer {

	private Server jettyServer;
	
	private ServletHandler handler;

	private final int PORT;
	
	/**
	 * constructor
	 * @param port
	 */
	public V1JettyServer(int port) {

		this.PORT = port;
		
	}
	
	/**
	 * @return the handler
	 */
	public ServletHandler getHandler() {
		return handler;
	}
	
	/**
	 * Initialises the Jetty server
	 */
	public void initialize() {

		this.jettyServer = new Server();

		ServerConnector connector = new ServerConnector(this.jettyServer);
		connector.setPort(this.PORT);
		this.jettyServer.setConnectors(new Connector[] {connector});

		
		this.handler = new ServletHandler();
		this.jettyServer.setHandler(this.handler);

	}

	
	/**
	 * adds mapping to the server handler
	 * @param clazz
	 * @param path
	 */
	public void addMapping(Class clazz, String path) {
		//only HttpServlet sub class can be mapped
		if(clazz.getGenericSuperclass().toString().endsWith(".HttpServlet")) {
			this.handler.addServletWithMapping(clazz, path);
		}
	}
	
	
	/**
	 * starts the Jetty server
	 */
	public void start() {
		try {
			this.jettyServer.start();
			this.jettyServer.join();
		} catch (Exception e) {
			System.out.println("Error in starting Jetty engine");
			e.printStackTrace();
			System.exit(1);
		}
		
	}
	

//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		V1JettyServer server = new V1JettyServer(9999);
//		server.initialize();
//		server.addMapping(WatsonSentimentServlet.class, "/sentiment/watson");
//		server.start();
//
//	}

}
