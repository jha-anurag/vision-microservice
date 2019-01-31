/**
 * 
 */
package vision.clarifai.params;

import java.util.ArrayList;

/**
 * @author anuragjha
 *
 */
public class DataParam {
	
	ArrayList<ConceptParam> concepts;
	ArrayList<FrameParam> frames;

	/**
	 * 
	 */
	public DataParam() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the concepts
	 */
	public ArrayList<ConceptParam> getConcepts() {
		return concepts;
	}

	/**
	 * @return the frames
	 */
	public ArrayList<FrameParam> getFrames() {
		return frames;
	}
	
	
	

}
