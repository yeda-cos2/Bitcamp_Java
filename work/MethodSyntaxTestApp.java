public class MethodSyntaxTestApp{

	public static void main(String[] args) 
	{
		MethodSyntax methodSyntax = new MethodSyntax();

		System.out.println("\n===============================");
		methodSyntax.browserOn();

		System.out.println("\n===============================");
		boolean result=methodSyntax.documentWork();
		System.out.println("doc �۾�����: "+result);

		int value = methodSyntax.sum(1,1);
		System.out.println("��� �����:"+value);

		String name = methodSyntax.getName();
		System.out.println("Field���� name:"+name);

		String add = methodSyntax.getAdd();
		System.out.println("Field���� add:"+add);

		String[] info = methodSyntax.getAllInformation();
		System.out.println("Field���� ��� ���");

		for(int i=0;i<2;i++){
			System.out.println((i+1)+"��° ����:"+info[i]);

		}
	}
}
