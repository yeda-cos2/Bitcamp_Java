import java.util.*;

public class VectorTest03{

	public static void main(String[] args){

		Vector<String> vector = new Vector<String>(10,10);

		String s1=new String("1.ȫ ");
		vector.add(s1);
		vector.add(new String("2.�� "));
		vector.add("3.�� �ȳ�");

		for(int i=0;i<vector.size();i++){
			String s=vector.elementAt(i);
			System.out.print(s);
		}

		System.out.println("\nJDK 1.5 �߰����:: Generic, Enhanced For Loop ���");

		for(String value:vector){
			System.out.print(value);
		}

		System.out.println("\n ==> API Ȯ��");
		vector.insertElementAt("4.��",1);
		for(int i=0; i<vector.size();i++){
			System.out.print(vector.elementAt(i));
		}

		System.out.println("\n ==> API Ȯ��");
		vector.setElementAt("5.,ȫ���",3);
		for(int i=0; i<vector.size();i++){
			System.out.print((String)vector.elementAt(i));
		}

		System.out.println("\n ==> API Ȯ��");
		vector.removeElementAt(3);
		for(int i=0; i<vector.size();i++){
			System.out.print((String)vector.elementAt(i));
		}
	}
}
