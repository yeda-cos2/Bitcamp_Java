class Account {

	// Field
	private String accNo="";
	private int balance;

	// Constructor
	public Account() {

	}

	public Account(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo+"계좌가 개설되었습니다.");
	}

	// Method
	public int getBalance() {
		return balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void save(int money) {
		System.out.println(accNo+"계좌에 "+money+"만원이 입금되었습니다.");
		balance += money;
	}

	public void deposit(int money) {
		System.out.println(accNo+"계좌에 "+money+"만원이 출금되었습니다.");
		balance -= money;
	}
}

public class TestAccount {

	public static void main(String[] args) {

		String accNo;
		int balance;

		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo + "계좌의 잔고는 " + balance + "만원 입니다.");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accNo + "계좌의 잔고는 " + balance + "만원 입니다.");

		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo + "계좌의 잔고는 " + balance + "만원 입니다.");

	}
}
