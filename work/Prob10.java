public class Prob10{

public void printSeason(int month){
	
	String season="��";

	switch(month){
		case 3:
		case 4:
		case 5:
			//System.out.println("���� �¾�̳׿�");
			break;
		
		case 6:
		case 7:
		case 8:
			//System.out.println("������ �¾�̳׿�");
			season="����";
			break;

		case 9:
		case 10:
		case 11: 
			//System.out.println("������ �¾�̳׿�");
			season="����";
			break;
		
		default:
			//System.out.println("�ܿ￡ �¾�̳׿�");
			season="�ܿ�";
			break;
}
System.out.println(season+"�� �¾�̳׿�");
}

	public static void main(String[] args){
		int month=Integer.parseInt(args[0]);
		new Prob10().printSeason(month);

			if(month<1 || month>12){
				System.out.println("1~12������ ���ڸ� �Է��ϼž� �մϴ�.");
				return;
			}

} //end of main
} //end of clas