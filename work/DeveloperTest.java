public class DeveloperTest

{
	public static void main(String[] args) 
	{

		Developer developer = new Developer();

		System.out.println("�̸�: "+Developer.name);
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
	
	}
}
