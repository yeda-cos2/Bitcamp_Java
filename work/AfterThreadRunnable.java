//package jp04.part01;

public class AfterThreadRunnable implements Runnable{

	private String name;

	public AfterThreadRunnable() {
	}

	public AfterThreadRunnable(String name) {
		this.name=name;
	}

	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println(name + " : " + i);

			/*
			 * try{ Tread.sleep(100); }catch(InterruptedException e){ System.out.println(e);
			 * }
			 */
		}
	}

	public static void main(String[] args) {
		System.out.println("����� main start");
		AfterThreadRunnable bt1 = new AfterThreadRunnable("1��°");
		AfterThreadRunnable bt2 = new AfterThreadRunnable("2��°");

		Thread t1 = new Thread(bt1);
		Thread t2 = new Thread(bt2);

		t1.start();
		t2.start();
		System.out.println("����� main end");
	}
}
