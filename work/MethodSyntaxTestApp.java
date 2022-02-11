public class MethodSyntaxTestApp{

	public static void main(String[] args) 
	{
		MethodSyntax methodSyntax = new MethodSyntax();

		System.out.println("\n===============================");
		methodSyntax.browserOn();

		System.out.println("\n===============================");
		boolean result=methodSyntax.documentWork();
		System.out.println("doc 작업유무: "+result);

		int value = methodSyntax.sum(1,1);
		System.out.println("계산 결과값:"+value);

		String name = methodSyntax.getName();
		System.out.println("Field정보 name:"+name);

		String add = methodSyntax.getAdd();
		System.out.println("Field정보 add:"+add);

		String[] info = methodSyntax.getAllInformation();
		System.out.println("Field정보 모두 출력");

		for(int i=0;i<2;i++){
			System.out.println((i+1)+"번째 정보:"+info[i]);

		}
	}
}
