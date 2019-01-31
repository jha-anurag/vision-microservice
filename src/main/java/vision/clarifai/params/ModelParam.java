/**
 * 
 */
package vision.clarifai.params;

import java.security.Timestamp;



/**
 * @author anuragjha
 *
 */
public class ModelParam {

	private String name;
	private String id;
	private String created_at;
	private String app_id;
	private OutputInfoParam output_info;
	private ModelVersionParam model_version;
	/**
	 * 
	 */
	public ModelParam() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
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
	 * @return the app_id
	 */
	public String getApp_id() {
		return app_id;
	}
	/**
	 * @return the output_info
	 */
	public OutputInfoParam getOutput_info() {
		return output_info;
	}
	/**
	 * @return the model_version
	 */
	public ModelVersionParam getModel_version() {
		return model_version;
	}
	
	

}
