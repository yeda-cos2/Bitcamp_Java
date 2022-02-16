public class Bank022 {

	int balance;
	int money;
	int command;
	String bankName;
	String userName;

	public Bank022() {
	}

	public Bank022(String[] str) {
		userName = str[0];
		bankName = str[1];
		command = Integer.parseInt(str[2]);
		money = Integer.parseInt(str[3]);
	}

	public void work() {
		if (command == 1) {
			deposit();
		} else if (command == 2) {
			withdrawal();
		}
	}

	public void deposit() {
		balance += money;
		System.out.println(money + "원 입금함");
	}

	public void withdrawal() {
		balance -= money;
		System.out.println(money + "원 출금함");
	}

	public void displayMoney() {
		System.out.println("현재 잔고는 " + balance + "입니다");
	}

	public static void main(String[] args) {
		if (!(args.length == 2 || args.length == 4)) {
			System.out.println("[usage]:: 인자값이 2개,4개 필요합니다.");
			System.exit(0);
		}

		System.out.println(args[0] + "님의 주거래은행은 " + args[1] + " 입니다.");
		Bank022 b = new Bank022();

		if (args.length != 2) {
			int command = Integer.parseInt(args[2]);
			if (command != 1 && command != 2) {
				System.out.println("[usage]::option을 확인하세요::1=>입금 2=>출금");
				return;
			}
			b = new Bank022(args);
			b.work();
		}
		b.displayMoney();
	}
}