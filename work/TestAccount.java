class Account {

	// Field
	private String accNo="";
	private int balance;

	// Constructor
	public Account() {

	}

	public Account(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo+"���°� �����Ǿ����ϴ�.");
	}

	// Method
	public int getBalance() {
		return balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void save(int money) {
		System.out.println(accNo+"���¿� "+money+"������ �ԱݵǾ����ϴ�.");
		balance += money;
	}

	public void deposit(int money) {
		System.out.println(accNo+"���¿� "+money+"������ ��ݵǾ����ϴ�.");
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
		System.out.println(accNo + "������ �ܰ�� " + balance + "���� �Դϴ�.");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accNo + "������ �ܰ�� " + balance + "���� �Դϴ�.");

		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo + "������ �ܰ�� " + balance + "���� �Դϴ�.");

	}
}
