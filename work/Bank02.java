public class Bank02{

	int balance;
	int money;
	int command;
	String bankName;
	String userName;

	public Bank02(){
	}
	public Bank02(String s1, String s2){
		userName=s1;
		bankName=s2;
	}
	public Bank02(String s1, String s2, String s3){
		userName=s1;
		bankName=s2;
		command=Integer.parseInt(s3);
	}
	public Bank02(String s1, String s2, String s3, String s4){
		userName=s1;
		bankName=s2;
		command=Integer.parseInt(s3);
		money=Integer.parseInt(s4);
	}

	public void deposit(){
		balance+=money;
		System.out.println(money+"원 입금함");
	}
	public void withdrawal(){
		balance-=money;
		System.out.println(money+"원 출금함");
	}
	public void displayMoney(){
		System.out.println("현재 잔고는 "+balance+"원");
	}

	public static void main(String[] args){
		if(args.length<2){
			System.out.println("인자값을 2개 이상 입력하세요");
			System.exit(0);
		}

		System.out.println(args[0]+"님의 주거래은행은 "+args[1]+" 입니다.");
		
		Bank02 a = new Bank02();

		switch(args.length){
			case 2:
				a = new Bank02(args[0],args[1]);
				break;
			
			case 4:
				a = new Bank02(args[0],args[1],args[2],args[3]);
				int b = Integer.parseInt(args[2]);

			switch(b){
				case 1:
					a.deposit();
					break;

				case 2:
					a.withdrawal();
					break;
					}
			default:
					System.out.println("인자값을 잘못 입력하셨습니다.");
					break;

			}

		a.displayMoney();
	}
}
