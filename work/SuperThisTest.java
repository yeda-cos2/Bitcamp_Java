class JuniorHighSchool {
	String name = "���ѹα����б�";

	public JuniorHighSchool() {

	}

	public void schoolName() {
		System.out.println("���б� �̸�:" + name);

	}
} // end of class

class HighSchool extends JuniorHighSchool {
	String name = "���ѹα�����б�";

	public HighSchool() {

	}

	public HighSchool(String str) {
		name = str;
	}

	public void schoolName() {
//		String name="������";
		System.out.println("���б� �̸�: " + super.name);
		System.out.println("����б� �̸�: " + this.name);
		System.out.println("����б� �̸�: " + name);

	}

} // end of class

public class SuperThisTest {
	public static void main(String[] args) {
		HighSchool hs01=new HighSchool();
		hs01.schoolName();
		System.out.println("======================");
		
		HighSchool hs02= new HighSchool("�������б�");
		hs02.schoolName();
	}
}// end of class