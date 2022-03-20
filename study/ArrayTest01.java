package study;

public class ArrayTest01 {
	public static void main(String[] args) {
		String[] arr = new String[3];
		arr[0] = "°¡";
		arr[1] = "³ª";
		arr[2] = "´Ù";

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
