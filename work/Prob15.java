public class Prob15 {
	public static void main(String[] args) {

		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";

		for (int i = 0; i < sourceString.length(); i++) {
			if (sourceString.charAt(i) != ' ') {
				if (sourceString.charAt(i) == 'x' || sourceString.charAt(i) == 'y'||sourceString.charAt(i) == 'z') {
					encodedString += (char) (sourceString.charAt(i) - 23);

				} else {
					encodedString += (char) (sourceString.charAt(i) + 3); // 범위 안에 있으므로 casting 가능 ~125

				}
			} else {
				encodedString += " ";
			}
		}

		System.out.println("암호화할 문자열: " + sourceString);
		System.out.println("암호화된 문자열: " + encodedString);

	}// end of main
}// end of class
