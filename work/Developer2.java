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
//		if(avgIncome==100){
		return name;
//		}else{
//			return "����";
//		}
	}


	public int getProjectCareer(){
		System.out.println("getprojectCareer() method");
		return projectCareer;
	}

		public static void main(String[] args) 
	{

		Developer2 developer = new Developer2();

		System.out.println("�̸�: "+developer.name);
		System.out.println("����: "+developer.job);
		System.out.println("��ռ�����: "+developer.avgIncome);
		System.out.println("PJT �����: "+developer.projectCareer);
		System.out.println("==============================");

		String name=developer.getName();
		System.out.println("�̸���: "+name);

		System.out.println("�����: "+developer.getProjectCareer());
	



	}

}
