package solidprinciples.singleresponsibility;

public class UserController {

	public String createUser(String validUserJson) {
		User user = DataFormatter.jsonMapper(validUserJson);
		UserValidator uv = new UserValidator();
		if (!uv.isValidUser(user)) {
			return "ERROR";
		}
		UserPersistenceService persistence = new UserPersistenceService();
		persistence.save(user);
		return "SUCCESS";
	}

}
