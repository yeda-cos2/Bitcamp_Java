//package jp02.part05;

class A{

	public void abc(String message){
		System.out.println("::"+this.getClass().getName()+"start");
		System.out.println("::abc() "+message);
		System.out.println("::"+this.getClass().getName()+"end");
	}
}

public class AnonymousInnerClass{

	public static void main(String[] args){
		System.out.println("1.==============");
		A a=new A();
		a.abc("Hello");

		System.out.println("2.==============");
		new A().abc("Hello");

		
		new B(){
			public void def(String message){
				System.out.println("::Hi"+message);
	}
	}.abc("Hello");
	//.def("Hello");
	

	System.out.println("3.===============");
	new A(){
		public void def(String message){
		System.out.println("::"+this.getClass().getName()+"start");
		System.out.println("::def() "+message);
		System.out.println("::"+this.getClass().getName()+"end");
		}
	}.abc("Hello");

	System.out.println("4.=====================");
	new A(){
		public void def(String message){
		System.out.println("::"+this.getClass().getName()+"start");
		System.out.println("::def() "+message);
		System.out.println("::"+this.getClass().getName()+"end");
		}
	}.def("Hello");
	}
}

