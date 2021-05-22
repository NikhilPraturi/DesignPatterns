package solidprinciples.singleresponsibility;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class DataFormatter {

	private static ObjectMapper objectMapper = null;

	public static User jsonMapper(String jsonUser) {
		objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(jsonUser, User.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
