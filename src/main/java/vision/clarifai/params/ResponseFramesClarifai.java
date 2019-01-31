/**
 * 
 */
package vision.clarifai.params;

import java.util.ArrayList;

/**
 * @author anuragjha
 *
 */
public class ResponseFramesClarifai {
	
	private StatusParam status;
	//private OutputsParam outputs;
	ArrayList<OutputParam> outputs;

	/**
	 * 
	 */
	public ResponseFramesClarifai() {
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
