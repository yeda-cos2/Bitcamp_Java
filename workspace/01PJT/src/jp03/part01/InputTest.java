 package jp03.part01;

import java.io.*;

public class InputTest{

	public static void main(String[] args) throws IOException{

		System.out.println(args[0]);
		
		InputStream inputStream=System.in;

		System.out.println("�Է��� ��ٸ��ϴ�");
	
			while(true){

				int i=inputStream.read();
				char c=(char) i;

				System.out.println("�Է��ϽŰ�:"+c);

				if(c=='x'){
					inputStream.close();
					break;
				}
			}
		
	}
}