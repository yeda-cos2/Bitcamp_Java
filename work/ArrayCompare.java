package homework;

public class ArrayCompare {
//private static boolean=> ? 
	public static boolean equalsArr(int[] arr1, int[] arr2) {

		boolean equal = false;

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == arr2[i]) {
					equal = true;
				} else {
					equal = false;
				}
			}
		}
		return equal;
	}

	public static void main(String[] args) {
		int[] arr1 = { 3, 5, 6, 9, 10, 2, 7 };
		int[] arr2 = { 3, 5, 6, 9, 10, 2, 7 };
		if (ArrayCompare.equalsArr(arr1, arr2)) { //���� Ŭ���� �̸� ���� ���� ����/static�� �ϳ��� Ŭ���� �ȿ����� �׳� ���� �����ѵ� �׳� Ŭ�����̸����� �����ϴ� ������ ������
 			System.out.println("two array equals");
		} else {
			System.out.println("two array not-equals");
		}
		System.out.println("=============================");

		int[] arr3 = { 3, 5, 6, 9 };
		int[] arr4 = { 3, 5, 6, 9, 8 };
		if (equalsArr(arr3, arr4)) {
			System.out.println("two array equals");
		} else {
			System.out.println("two array not-equals");
		}

	}// end of main
}// end of class
