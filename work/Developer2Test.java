public class Developer2Test

{
	public static void main(String[] args) 
	{

		Developer2 developer = new Developer2();

		System.out.println("이름: "+developer.name);
		System.out.println("직업: "+developer.job);
		System.out.println("평균수입은: "+developer.avgIncome);
		System.out.println("PJT 경력은: "+developer.projectCareer);
		System.out.println("==============================");

		String name=developer.getName();
		System.out.println("이름은: "+name);

		System.out.println("경력은: "+developer.getProjectCareer());
	



	}
}
