/**
 * 
 */
package vision.clarifai.params;

import java.security.Timestamp;

/**
 * @author anuragjha
 *
 */
public class ModelVersionParam {

	private String id;
	private String created_at;
	private StatusParam status;
	
	
	/**
	 * 
	 */
	public ModelVersionParam() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @return the created_at
	 */
	public String getCreated_at() {
		return created_at;
	}


	/**
	 * @return the status
	 */
	public StatusParam getStatus() {
		return status;
	}
	
	

}
