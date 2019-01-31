/**
 * 
 */
package vision.clarifai;

import java.io.File;
import java.util.List;

import com.google.gson.Gson;

import clarifai2.api.ClarifaiBuilder;
import clarifai2.api.ClarifaiClient;
import clarifai2.api.ClarifaiResponse;
import clarifai2.dto.input.ClarifaiInput;
import clarifai2.dto.model.output.ClarifaiOutput;
import clarifai2.dto.prediction.Concept;
import clarifai2.dto.prediction.Frame;
import vision.clarifai.params.ConceptParam;
import vision.clarifai.params.FrameParam;
import vision.clarifai.params.OutputParam;
import vision.clarifai.params.ResponseFramesClarifai;
import vision.clarifai.params.ResponseImageClarifai;

/**
 * @author anuragjha
 *
 */
public class VisionClarifaiConnection {

	private final ClarifaiClient client;

	public VisionClarifaiConnection() {
		client = new ClarifaiBuilder("73c614b3a6fa4f268645f5838c9c2b69")
				.buildSync();
	}

	public void predictImage(String filename) {
		/// Predict the contents of an image : send bytes of an image
		ClarifaiResponse<List<ClarifaiOutput<Concept>>> imageP = client.getDefaultModels().generalModel().predict()
				//.withInputs(ClarifaiInput.forImage("https://samples.clarifai.com/metro-north.jpg"))
				//.withInputs(ClarifaiInput.forImage(new File("kathmandu.jpg")))
				.withInputs(ClarifaiInput.forImage(new File(filename)))
				.executeSync();

		System.out.println("result : i => " + imageP.rawBody());
		ResponseImageClarifai ric = new Gson().fromJson(imageP.rawBody(), ResponseImageClarifai.class);
		for(OutputParam op : ric.getOutputs()) {
			for(ConceptParam cp : op.getData().getConcepts()) {
				System.out.println("Name : " + cp.getName() + ", Value : " + cp.getValue());
			}
		}
		///
	}


	public void predictVideo() {
		/// Predict the contents of an video : send bytes of a video 
		ClarifaiResponse<List<ClarifaiOutput<Frame>>> frames = client.getDefaultModels().generalVideoModel().predict()
				//.withInputs(ClarifaiInput.forVideo("https://samples.clarifai.com/beer.mp4"))
				.withInputs(ClarifaiInput.forVideo(new File("SampleVideo.mp4")))
				.executeSync();

		System.out.println("v result -> " + frames.rawBody());
		ResponseFramesClarifai rfc = new Gson().fromJson(frames.rawBody(), ResponseFramesClarifai.class);
		for(OutputParam op : rfc.getOutputs()) {
			for(FrameParam fp : op.getData().getFrames()) {
				System.out.println("Frame Index" + fp.getFrame_info().getIndex());
				for(ConceptParam  cp : fp.getData().getConcepts()) {
					System.out.println("Name : " + cp.getName() + ", Value : " + cp.getValue());
				}
			}
		}
		///
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		VisionClarifaiConnection vcc = new VisionClarifaiConnection();
		//vcc.predictImage();
		vcc.predictVideo();

		// key - 73c614b3a6fa4f268645f5838c9c2b69
		//		final ClarifaiClient client = new ClarifaiBuilder("73c614b3a6fa4f268645f5838c9c2b69")
		//				.buildSync();

		//		/// Predict the contents of an image : send bytes of an image
		//		ClarifaiResponse<List<ClarifaiOutput<Concept>>> imageP = client.getDefaultModels().generalModel().predict()
		//				.withInputs(ClarifaiInput.forImage("https://samples.clarifai.com/metro-north.jpg"))
		//				//.withInputs(ClarifaiInput.forImage(new File("kathmandu.jpg")))
		//				.executeSync();
		//
		//		System.out.println("result : i => " + imageP.rawBody());
		//		ResponseImageClarifai ric = new Gson().fromJson(imageP.rawBody(), ResponseImageClarifai.class);
		//		for(OutputParam op : ric.getOutputs()) {
		//			for(ConceptParam cp : op.getData().getConcepts()) {
		//				System.out.println("Name : " + cp.getName() + ", Value : " + cp.getValue());
		//			}
		//		}
		//		///


		//		/// Predict the contents of an video : send bytes of a video 
		//		ClarifaiResponse<List<ClarifaiOutput<Frame>>> frames = client.getDefaultModels().generalVideoModel().predict()
		//				//.withInputs(ClarifaiInput.forVideo("https://samples.clarifai.com/beer.mp4"))
		//				.withInputs(ClarifaiInput.forVideo(new File("SampleVideo.mp4")))
		//				.executeSync();
		//		
		//		System.out.println("v result -> " + frames.rawBody());
		//		ResponseFramesClarifai rfc = new Gson().fromJson(frames.rawBody(), ResponseFramesClarifai.class);
		//		for(OutputParam op : rfc.getOutputs()) {
		//			for(FrameParam fp : op.getData().getFrames()) {
		//				System.out.println("Frame Index" + fp.getFrame_info().getIndex());
		//				for(ConceptParam  cp : fp.getData().getConcepts()) {
		//					System.out.println("Name : " + cp.getName() + ", Value : " + cp.getValue());
		//				}
		//			}
		//		}
		//		///

	}


}  // closing class

//Image Limits
//To get predictions for an input, you need to supply an image and the model you'd like to get 
//predictions from. You can supply an image either with a publicly accessible URL or by directly 
//sending bytes. You can send up to 128 images in one API call


//Video Limits
//The Predict API has limits to the length and size it can support. A video, uploaded through URL, 
//can be anywhere up to 80MB in size or 10mins in length. When a video is sent through by bytes, 
//the Predict API can support 10MB in size.


//Predict the contents of an image :
//Model<Concept> generalModel = client.getDefaultModels().generalModel();
//
//PredictRequest<Concept> request = generalModel.predict().withInputs(
//		ClarifaiInput.forImage("https://samples.clarifai.com/metro-north.jpg")
//		);
//List<ClarifaiOutput<Concept>> result = request.executeSync().get();
//System.out.println("result -> " + result);




//		// Predict the contents of a video :
//ClarifaiResponse<List<ClarifaiOutput<Frame>>> frames = client.getDefaultModels().generalVideoModel().predict()
//	    .withInputs(ClarifaiInput.forVideo(new File("bday.mp4)")))
//	    .executeSync();
//System.out.println("v result -> " + frames.get());

//////
