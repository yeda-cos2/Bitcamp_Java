//package jp02.part05;

public class OuterClass01{

	private String outer="OuterClass의 Field";

	public OuterClass01(){
	}

	public void outerMethod(){
		System.out.println("::"+this.getClass().getName()+"start..");
		InnerClass ic=new InnerClass();
		ic.innerMethod();
		System.out.println("::"+this.getClass().getName()+"end\n");
	}

	public class InnerClass{
		private String inner="InnerClass의 Field";

		public InnerClass(){
		}

		public void innerMethod(){
			System.out.println("::"+this.getClass().getName()+"start..");
			System.out.println(outer);
			System.out.println(OuterClass01.this.outer);
			// 에러 System.out.println(this.outer); =>클래스긴 해서 this쓰면 안에서만 찾음 쓰려면 참조클래스 적기
			System.out.println(inner);
			System.out.println("::"+this.getClass().getName()+"end.");
		}
	}

	public static void main(String[] args){
		new OuterClass01().outerMethod();
	}
}