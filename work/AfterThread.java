//package jp04.part01;

/*
*	FileName : AfterThread.java
*/
public class  AfterThread extends Thread{
	
    ///Field
    private String name;

    ///Constructor
    public AfterThread(){
    }
	public AfterThread(String name){
		this.name = name;
	}

    ///Method
	public void run(){
		for(int i=1;i<100;i++){
			System.out.println(name+" : "+i+"*"+9+"="+i*9);
		}
	 }

    ///Main Method
	public static void main(String[] args){

		System.out.println("여기는 main start....");

		AfterThread bt1 = new AfterThread("1번째");
		AfterThread bt2 = new AfterThread("2번째");
        //==>start() method 는 어디에 있는가.???
        bt1.start(); //start가 run호출
		bt2.start();

		for(int i=1;i<50;i++){ // main부터 끝나는거아님 확인
			System.out.println("main for : "+i+"*"+9+"="+i*9);
		}
		
        System.out.println("여기는 main end....");

	}//end of main

}//end of class

//==> 실행 결과는 ?
//==> start() method 의미는 ?