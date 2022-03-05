package jp04.part01;

public class AfterThreadRunnable implements Runnable{
//상속하던지 .....구현하던지
	private String name;

	public AfterThreadRunnable() {
	}

	public AfterThreadRunnable(String name) {
		this.name=name;
	}

	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println(name + " : " + i);

	
			  try{ Thread.sleep(100); }catch(InterruptedException e){ System.out.println(e);
			  }
			 
		}
	}

	public static void main(String[] args) {
		System.out.println("여기는 main start");
		Runnable bt1 = new AfterThreadRunnable("1번째");
		AfterThreadRunnable bt2 = new AfterThreadRunnable("2번째");

		Thread t1 = new Thread(bt1);//bt1은 run메소드 갖는다는 확신
		Thread t2 = new Thread(bt2);

		t1.start();
		t2.start();
		System.out.println("여기는 main end");
	}
}
