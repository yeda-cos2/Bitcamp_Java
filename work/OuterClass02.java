//package jp02.part05;

public class OuterClass02{

	private String outer="OuterClass�� Field";

	public OuterClass02(){
	}

	public void outerMethod(){
		System.out.println("::"+this.getClass().getName()+"start..");

		final String localVariable="OuterClass���� outerMethod�� localVariable";

	class InnerLocalClass{
		private String inner="InnerClass�� Field";

		public InnerLocalClass(){
		}

		public void innerMethod(){
			System.out.println("::"+this.getClass().getName()+"start");
			System.out.println(localVariable);
			System.out.println(outer);
			System.out.println(inner);
			System.out.println("::"+this.getClass().getName()+"end.");
		}
	}

InnerLocalClass ilc=new InnerLocalClass();
ilc.innerMethod();
	}


	public static void main(String[] args){
		new OuterClass02().outerMethod();
	}
}