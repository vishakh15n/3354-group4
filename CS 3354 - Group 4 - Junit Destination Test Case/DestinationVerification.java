package utdpathfinder;

public class DestinationVerification {
	public static int checkAlphaNumeric(String stringToTest) {
		char[] chars = stringToTest.toCharArray();
		boolean isNonAlphaNumericCharacter = false;
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				isNonAlphaNumericCharacter = true;
			}
		}
		if(isNonAlphaNumericCharacter){
			return 0;
		} else {
			return 1;
		}
	}
}
