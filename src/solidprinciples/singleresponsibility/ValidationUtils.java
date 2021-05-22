package solidprinciples.singleresponsibility;

public class ValidationUtils {

	public static boolean isNotBlank(String alphaNumeric) {
		boolean flag = false;
		if (alphaNumeric != null) {
			if (alphaNumeric.length() > 0) {
				flag = true;
			}
		}
		return flag;
	}

	public static boolean isNotZero(int numeric) {
		if (numeric > 0) {
			return true;
		}
		return false;
	}
}
