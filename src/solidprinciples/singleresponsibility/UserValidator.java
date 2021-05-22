package solidprinciples.singleresponsibility;

public class UserValidator {

	public boolean isValidUser(User user) {
		return validateUser(user);
	}

	private boolean validateUser(User user) {
		if (ValidationUtils.isNotBlank(user.getName()) && ValidationUtils.isNotBlank(user.getAddress())
				&& ValidationUtils.isNotZero(user.getAge())) {
			return true;
		}
		return false;
	}
}
