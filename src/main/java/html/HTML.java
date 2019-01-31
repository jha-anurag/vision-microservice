/**
 * 
 */
package html;

/**
 * @author anuragjha
 * HTMLBlocks contains building blocks of HTML : method request will result in return of HTML String
 */
public class HTML {

	public static enum FORMMETHOD {GET, POST};
	public static enum INPUTTYPE {text, textarea};
	public static enum INPUTSUBMIT {submit};

	/**
	 * 
	 */
	public HTML() {
		// TODO Auto-generated constructor stub
	}

	public static String htmlOpen() {
		return "<!DOCTYPE html>"
				+ "<html lang=\"en\">";
	}

	public static String htmlClose() {
		return "</html>";
	}

	/**
	 * head method declares html and creates html head
	 * @param title
	 * @return
	 */
	public static String head(String title)	{

		return "<head>"
				+ "<meta charset=\"utf-8\"/>"
				+  "<title>" + title+ "</title>"
				+ "</head>";
	}


	/**
	 * bodyStart method writes HTML body start
	 */
	public static String bodyOpen()	{
		return "<body>";
	}

	/**
	 * bodyEnd method writes HTML body end
	 */
	public static String bodyClose() {
		return "</body>";
	}

	public static String formOpen(String action, FORMMETHOD method) {

		return "<form action=\"" + action + "\" method=\"" + method.name() + "\">";
	}

	public static String formClose() {

		return "</form>";
	}

	public static String breakLine() {
		return "<br/>";
	}

	public static String label(String forValue, String content) {
		return "<label for=\""+ forValue +"\">" + content + "</label>";
	}


	public static String input(INPUTTYPE inputType, String id, String name) {
		return "<input type=\"" + inputType.name() + "\" id=\"" + id + "\" name=\"" + name + "\"  rows = \"4\" cols = \"50\" />";
	}

	public static String submit() {
		return "<input type=\"" + "submit" + "\" value=\"" + "submit" + "\" />";
	}
	
	public static String submit(String value) {
		return "<input type=\"" + "submit" + "\" value=\"" + value + "\" />";
	}

	public static String h3(String content) {
		return "<h3>" + content + "</h3>";
	}

	public static String pOpen() {
		return "<p>";
	}

	public static String pClose() {
		return "</p>";
	}

	public static String trOpen() {
		return "<tr>";
	}

	public static String trClose() {
		return "</tr>";
	}

	public static String td(String content) {
		return "<td>" + content + "</td>";
	}

	public static String tdOpen() {
		return "<td>";
	}

	public static String tdClose() {
		return "</td>";
	}
	
	public static String th(String content) {
		return "<th>" + content + "</th>";
	}

	public static String preBuiltHtml(String preBuilt) {
		return preBuilt;
	}

	public static String tableOpen() {
		return "<table>";
	}

	public static String tableClose() {
		return "</table>";
	}
	
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
