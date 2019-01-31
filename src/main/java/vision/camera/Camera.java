package vision.camera;


import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;


/**
 * Created by gtiwari on 1/3/2017.
 */

public class Camera {
	
	Webcam webcam;
	
	public Camera() {
		webcam = Webcam.getDefault();
	}

	public void open() {
		webcam.open();
	}
	
	public void close() {
		webcam.close();
	}
	
	public void click(String fileName) {
		try {
			ImageIO.write(webcam.getImage(), "PNG", new File(fileName));//"hello-world.png"
		} catch (IOException e) {
			System.out.println("Errror in IO operations");
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {   


	}
}