public class Developer1Test

{
	public static void main(String[] args) 
	{

		Developer1 developer = new Developer1();

		System.out.println("�̸�: "+developer.name);
		System.out.println("����: "+developer.job);
		System.out.println("��ռ�����: "+developer.avgIncome);
		System.out.println("PJT �����: "+developer.projectCareer);
		System.out.println("==============================");

		developer.participateProject();
		System.out.println("��ռ�����: "+developer.avgIncome);
		System.out.println("������Ʈ ���� �����: "+developer.projectCareer);
		System.out.println("===============================");

		developer.instruct();
		System.out.println("��ռ�����: "+developer.avgIncome);

		String projectName ="�ѹ�����";
		developer.participateProject(projectName);
		//hong.participateProject("�ѹ�����");

		System.out.println("��ռ�����: "+developer.avgIncome);
		System.out.println("������Ʈ ���� �����: "+developer.projectCareer);

		int lectureCount=2;
		developer.instruct(lectureCount);
		System.out.println("��ռ�����: "+developer.avgIncome);
	



	}
}