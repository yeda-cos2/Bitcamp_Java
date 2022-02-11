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
		System.out.println(money+"�� �Ա���");
	}
	public void withdrawal(){
		balance-=money;
		System.out.println(money+"�� �����");
	}
	public void displayMoney(){
		System.out.println("���� �ܰ�� "+balance+"��");
	}

	public static void main(String[] args){
		if(args.length<2){
			System.out.println("���ڰ��� 2�� �̻� �Է��ϼ���");
			System.exit(0);
		}

		System.out.println(args[0]+"���� �ְŷ������� "+args[1]+" �Դϴ�.");
		
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
					System.out.println("���ڰ��� �߸� �Է��ϼ̽��ϴ�.");
					break;

			}

		a.displayMoney();
	}
}
