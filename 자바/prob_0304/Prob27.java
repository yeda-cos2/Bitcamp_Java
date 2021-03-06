package prob_0304;

import java.util.List;
import java.util.Vector;
import java.util.zip.DataFormatException;

public class Prob27 {
	public static void main(String[] args) throws DataFormatException {

		Vector bookList = new Vector();
		bookList.add(makeBook("Java기초 : 컴퓨터 : 35000"));
		bookList.add(makeBook("초보자 sql : 컴퓨터 : 28000"));
		bookList.add(makeBook("html api 소개 : 컴퓨터 : 58000"));

		// Case1
		bookList.add(makeBook("programming 기초 : 컴퓨터 : 45000"));

		// Case2
		// bookList.add(makeBook("programming 기초: 컴퓨터"));

		bookList.add(makeBook("programming 고급 : 컴퓨터 : 56000"));
		System.out.println("책목록");
		printBookList(bookList);
	}

	private static Book makeBook(String bookData) throws DataFormatException {
		String[] arr = bookData.split(":");
		if (arr.length == 3) {
				Book b = new Book();
				
				return b;
		} else {
			throw new DataFormatException();
		}
	}

	private static void printBookList(Vector bookList) {

	}
}
