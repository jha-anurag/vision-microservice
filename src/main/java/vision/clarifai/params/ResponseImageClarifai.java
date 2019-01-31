/**
 * 
 */
package vision.clarifai.params;

import java.util.ArrayList;

/**
 * @author anuragjha
 *
 */
public class ResponseImageClarifai {
	
	private StatusParam status;
	private ArrayList<OutputParam> outputs;

	/**
	 * 
	 */
	public ResponseImageClarifai() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the status
	 */
	public StatusParam getStatus() {
		return status;
	}

	/**
	 * @return the outputs
	 */
	public ArrayList<OutputParam> getOutputs() {
		return outputs;
	}
	
	

}
