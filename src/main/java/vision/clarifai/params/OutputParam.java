/**
 * 
 */
package vision.clarifai.params;

import java.security.Timestamp;

/**
 * @author anuragjha
 *
 */
public class OutputParam {

	private String id;
	private StatusParam status;
	private String created_at;
	private ModelParam model;
	private InputParam input;
	private DataParam data;
	
	
	/**
	 * 
	 */
	public OutputParam() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @return the status
	 */
	public StatusParam getStatus() {
		return status;
	}


	/**
	 * @return the created_at
	 */
	public String getCreated_at() {
		return created_at;
	}


	/**
	 * @return the model
	 */
	public ModelParam getModel() {
		return model;
	}


	/**
	 * @return the input
	 */
	public InputParam getInput() {
		return input;
	}


	/**
	 * @return the data
	 */
	public DataParam getData() {
		return data;
	}
	
	
	

}
