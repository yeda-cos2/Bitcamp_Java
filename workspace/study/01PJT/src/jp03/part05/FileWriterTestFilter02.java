package jp03.part05;

import java.io.*;

public class FileWriterTestFilter02{

	public static void main(String[] args) throws Exception{

		BufferedReader br=null;
		BufferedWriter bw=null;

		br=new BufferedReader(new InputStreamReader(System.in));
		bw=new BufferedWriter(new FileWriter("src/jp03/part05/test.txt",false)); //���ϰ�� ����: src/ �� src\\


		System.out.println("ȭ�Ͽ� �����Ͻ� ���� �Է��ϼ��� ");
		while(true){
			String str=br.readLine();
			if(str.equals("��")){
				break;
			}
			bw.write(str,0,str.length());
			bw.newLine();
		}
			bw.flush();

			br.close();
			bw.close();
		}
	}