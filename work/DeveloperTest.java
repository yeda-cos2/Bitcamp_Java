public class DeveloperTest

{
	public static void main(String[] args) 
	{

		Developer developer = new Developer();

		System.out.println("이름: "+Developer.name);
		System.out.println("직업: "+developer.job);
		System.out.println("평균수입은: "+developer.avgIncome);
		System.out.println("PJT 경력은: "+developer.projectCareer);
		System.out.println("==============================");

		developer.participateProject();
		System.out.println("평균수입은: "+developer.avgIncome);
		System.out.println("프로젝트 참여 경력은: "+developer.projectCareer);
		System.out.println("===============================");

		developer.instruct();
		System.out.println("평균수입은: "+developer.avgIncome);
	
	}
}
