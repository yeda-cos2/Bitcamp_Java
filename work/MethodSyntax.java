public class MethodSyntax

{
	String name="ȫ�浿";
	String add="�Ѿ�";

	public void browserOn(){
		System.out.println("browser�� Ű��");
	}

	public boolean documentWork(){
		System.out.println("document �۾��� �ϰ� �۾��ϼ� ������ boolean return");
		return true;
	}

	public int sum(int i,int j){
		System.out.println("<<"+i+">>�� <<"+j+">>���� �޾� �� return");
		return(i+j);
	}

	public String getName(){
		System.out.println("�̸� ����");
		return name;
	}

	public String getAdd(){
		System.out.println("�ּ� ����");
		return add;
	}

	public String[] getAllInformation(){
		String[] str={name,add};
		return str;


	}
}
