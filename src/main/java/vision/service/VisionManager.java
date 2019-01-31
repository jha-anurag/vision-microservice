/**
 * 
 */
package vision.service;

import java.util.concurrent.TimeUnit;

import vision.camera.Camera;
import vision.clarifai.VisionClarifaiConnection;

/**
 * @author anuragjha
 *
 */
public class VisionManager implements Runnable {

	private Camera camera;// = new Camera();
	private volatile boolean keepOn;

	private VisionClarifaiConnection vcConn;

	public VisionManager() {
		keepOn = true;
	}


	/**
	 * @param keepOn the keepOn to set
	 */
	public void setKeepOn(boolean keepOn) {
		this.keepOn = keepOn;
	}

	
	private void initialize() {
		camera = new Camera();
		camera.open();

		vcConn = new VisionClarifaiConnection();	
	}

	public void stop() {
		System.out.println("Closing Vision");
		keepOn = false;
		camera.close();
		

	}

	@Override
	public void run() {

		this.initialize();

		int i = 0;
		while(keepOn) {

			camera.click("images/image" + i + ".png"); // take picture
			System.out.println("Image Taken : " + "image" + i + ".png");

			vcConn.predictImage("images/image" + i + ".png");  // predict contents of image

			i = i + 1;	
			
			///add delay
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		

	}





}
