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

		String newstring = "";
		int count = 1;

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == str2.charAt(0)) {
				count++;
			}
		}

		String[] array = new String[count];
		for (int j = 0; j < array.length; j++) {
			if (str1.contains(str2)) {
				newstring = str1.substring(0, str1.indexOf(str2));
				array[j] = newstring;
				str1 = str1.substring(str1.indexOf(str2) + 1, str1.length());
			} else {
				array[j] = str1;
			}
		}

		return array;

	}
}
