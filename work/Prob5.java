public class Prob5 {

	public static void main(String[] args) {

		int[] array = { 3, 24, 1, 55, 17, 43, 5 };
		int temp;

		for (int i = 0; i < array.length - 1; i++) {

			for (int k = 0; k < array.length - 1; k++) {

				if (array[k] > array[k + 1]) {
					temp = array[k];
					array[k] = array[k + 1];
					array[k + 1] = temp;

				} // end of if

			} // end of for

		} // end of for
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);

			if (i < array.length - 1) {
				System.out.print(",");
			}

//			if(i != array.length-1){
//				System.out.print(",");
//			}else{
//				System.out.print("");

		} // end of for

	}// end of main
}// end of class