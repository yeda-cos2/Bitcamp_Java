public class MethodSyntax

{
	String name="홍길동";
	String add="한양";

	public void browserOn(){
		System.out.println("browser을 키다");
	}

	public boolean documentWork(){
		System.out.println("document 작업을 하고 작업완성 유무를 boolean return");
		return true;
	}

	public int sum(int i,int j){
		System.out.println("<<"+i+">>와 <<"+j+">>값을 받아 합 return");
		return(i+j);
	}

	public String getName(){
		System.out.println("이름 전달");
		return name;
	}

	public String getAdd(){
		System.out.println("주소 전달");
		return add;
	}

	public String[] getAllInformation(){
		String[] str={name,add};
		return str;


	}
}
