public class Prob14 {
	public static void main(String[] args) {

		Book[] booklist = new Book[5];

		Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals",30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book(); //상태값 몰라서 만들어놓고 
		book5.setTitle("EJB Program"); //나중에 setting
		book5.setPrice(34000);
		//Book book6 = new Book("JDBC Program",50000);


		booklist[0] = book1; //book1대신 new Book("Java Program", 25000); 로 바로 넣어도됨
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		book5.setTitle("EJB Program");
		book5.setPrice(34000);
		//booklist[6]=book6;

		BookMgr mgr = new BookMgr(booklist);

		System.out.println("===책 목록===");
		mgr.printBooklist();
		System.out.println("");

		System.out.println("===책 가격의 총합===");
		mgr.printTotalPrice();
		
	}//end of main
}//end of class
