public class SortUtil {
	public int[] ascending(int[] inputNumbers) {
		int temp,i,j;

		for (i = 0; i < inputNumbers.length - 1; i++) {

			for (j = 0; j < inputNumbers.length - 1; j++) {

				if (inputNumbers[j] > inputNumbers[j + 1]) {

					temp = inputNumbers[j];
					inputNumbers[j] = inputNumbers[j + 1];
					inputNumbers[j + 1] = temp;

				} // end of if
			} // end of for

		} // end of for
			return inputNumbers;

	}


	public static void main(String[] args) {

		SortUtil util = new SortUtil();
		int[] numbers = new int[] { 7, 5, 2, 19, 34, 51, 32, 11, 67, 21 };

		numbers = util.ascending(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);

			if (i != numbers.length - 1) {
				System.out.print(",");
			} else {
				System.out.print("");
			}

		}//for

		System.out.println("Successful!!");

	}//end of main

}//end of class