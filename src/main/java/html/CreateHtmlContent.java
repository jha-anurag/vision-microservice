/**
 * 
 */
package html;

/**
 * @author anuragjha
 *
 */
public class CreateHtmlContent {

	public static String searchForm() {
		return "<!doctype html>\n" + 
				"\n" + 
				"<html lang=\"en\">\n" + 
				"<head>\n" + 
				"  <meta charset=\"utf-8\" />\n" + 
				"\n" + 
				"  <title>Sentiment Analysis</title>\n" + 
				"  <meta name=\"description\" content=\"Sentiment Analysis using IBM Watson - Tone Analyzer\" />\n" + 
				"  <meta name=\"author\" content=\"Anurag\" />\n" + 
				"\n" + 
				"  <link rel=\"stylesheet\" href=\"css/styles.css?v=1.0\" />\n" + 
				"\n" + 
				"</head>\n" + 
				"\n" + 
				"<body>\n" + 
				"  <h2>Paste Text to get Sentiment</h2>\n" + 
				"\n" + 
				"<!-- Form -->\n" + 
				"<form action=\"/sentiment/watson/page\" method=\"POST\">\n" + 
				"  <label>Paste Text:</label><br>\n" + 
				"  <input type=\"text\" name=\"content\">\n" + 
				"\n" + 
				"  <br /><br />\n" + 
				"  <input type=\"submit\" value=\"Submit\" />\n" + 
				"</form> \n" + 
				"\n" + 
				"  <script src=\"js/scripts.js\"></script>\n" + 
				"</body>\n" + 
				"</html>";
	}

	public static String imageResultTable() {
		StringBuilder htmlPage = new StringBuilder();
		
		return htmlPage.toString();
	}
	
	public static String convSearchForm() {
		return "<!doctype html>\n" + 
				"\n" + 
				"<html lang=\"en\">\n" + 
				"<head>\n" + 
				"  <meta charset=\"utf-8\" />\n" + 
				"\n" + 
				"  <title>Conversation Sentiment Analysis</title>\n" + 
				"  <meta name=\"description\" content=\"ConversationSentiment Analysis using IBM Watson - Tone Analyzer\" />\n" + 
				"  <meta name=\"author\" content=\"Anurag\" />\n" + 
				"\n" + 
				"  <link rel=\"stylesheet\" href=\"css/styles.css?v=1.0\" />\n" + 
				"\n" + 
				"</head>\n" + 
				"\n" + 
				"<body>\n" + 
				"  <h2>Paste Conversation to get Sentiment</h2>\n" + 
				"\n" + 
				"<!-- Form -->\n" + 
				"<form action=\"/sentiment/watson/conversation/page\" method=\"POST\">\n" + 
				"  <label>Paste Text:</label><br>\n" + 
				"  <input type=\"text\" name=\"content\">\n" + 
				"\n" + 
				"  <br /><br />\n" + 
				"  <input type=\"submit\" value=\"Submit\" />\n" + 
				"</form> \n" + 
				"\n" + 
				"  <script src=\"js/scripts.js\"></script>\n" + 
				"</body>\n" + 
				"</html>";
	}
	
	
//	public static String resultConvTable(RespConvParams respConvParams) {
//		StringBuilder htmlPage = new StringBuilder();
//		htmlPage.append(CreateHtmlContent.searchForm());
//		htmlPage.append(HTML.breakLine() + HTML.breakLine());
////		htmlPage.append(HTML.tableOpen());  // document tone
////		htmlPage.append(HTML.trOpen());
////		htmlPage.append(HTML.th("Document Tone -> "));
////		for(Tone tone : respConvParams.getDocument_tone().getTones()) {
////			htmlPage.append(HTML.th(" |#| " + tone.getTone_name() + " : " + tone.getScore()));
////		}
////		htmlPage.append(HTML.trClose());
////		htmlPage.append(HTML.tableClose());
////		/////////////////////////////////
////		htmlPage.append(HTML.breakLine());
//		//////////////////////////////////
//		htmlPage.append(HTML.tableOpen());  // sentences tone
//		htmlPage.append(HTML.trOpen());
//		if(respConvParams.getUtterances_tone() != null) {
//			for(UtteranceTone sTone : respConvParams.getUtterances_tone()) {
//				htmlPage.append(HTML.trOpen());
//				htmlPage.append(HTML.td(sTone.getUtterance_text()));
//				for(Tone tone : sTone.getTones()) {
//					htmlPage.append(HTML.td(tone.getTone_name() + " : " + tone.getScore()));
//				}
//				htmlPage.append(HTML.trClose());
//			}
//		}
//
//		htmlPage.append(HTML.trClose());
//		htmlPage.append(HTML.tableClose());
//
//		return htmlPage.toString();
//	}




}
