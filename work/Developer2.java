public class Developer2
{
		String name="ȫ�浿";
		String job="������";
		int avgIncome=100;
		int projectCareer;

	public void participateProject(){
			System.out.println("���α׷����߷� ��������, ��½���");
			avgIncome++;
			projectCareer++;
		}

	

	public void participateProject(String project){
		System.out.println(project+"==>project ������ ���� ����,��½���");
		avgIncome++;
		projectCareer++;
	}

	public void instruct(){
			System.out.println("���Ǹ� ���� ��������");
			avgIncome++;

	}

	public void instruct(int lectureCount){
		System.out.println(lectureCount+"�� ���Ǹ� ���� ���� ����");
		avgIncome+=lectureCount;
	}

	public String getName(){
		System.out.println("getNmae() method");
		return name;
	}

	public int getProjectCareer(){
		System.out.println("getprojectCareer() method");
		return projectCareer;
	}

}