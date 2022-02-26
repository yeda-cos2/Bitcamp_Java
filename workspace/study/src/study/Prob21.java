package study;

public class Prob21 {

	public static void main(String[] args) {
		String str = "PROD-001#Z-note#Samsung#3#6000000";
		String[] strs = stringSplit(str, "#");
		System.out.println("===문자열 처리 결과===");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

	private static String[] stringSplit(String str1, String str2) {
		String[] array = new String[str1.length()];
		String newstring ="";

		for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == str2.charAt(0)) {
					array[i] += "";
				} else {
					array[i] += str1.charAt(i);
				}
				
			}

		return array;

	}
}
