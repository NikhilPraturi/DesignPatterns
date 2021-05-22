package solidprinciples.singleresponsibility;

public class Main {

	private static final String VALID_USER_JSON = "{        \"name\":       \"sonoo\",   \r\n"
			+ "        \"age\":      22,   \r\n"
			+ "        \"address\":    \"fed\"  \r\n"
			+ "}";
	private static final String INVALID_USER_JSON = "{        \"name\":       \"aa\",   \r\n"
			+ "        \"age\":      0,   \r\n"
			+ "        \"address\":    \"fed\"  \r\n"
			+ "}";
	
	public static void main(String[] args) {
	
		UserController userController = new UserController();
		String response  = userController.createUser(VALID_USER_JSON);
		if(!response.equalsIgnoreCase("SUCCESS")) {
			System.err.println("Failed");
		}
		System.out.println("Valid JSON received response :" + response);
	    response  = userController.createUser(INVALID_USER_JSON);
		if(!response.equalsIgnoreCase("ERROR")) {
			System.err.println("Failed");
		}
		System.out.println("INValid JSON received response :" + response);
	}
}
