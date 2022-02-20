import java.util.*;

public class VectorTest02 extends Vector{
	
	public VectorTest02(){
		super();
	}
	
	public VectorTest02(int initialCapacity, int capacityIncrement) {
		super(initialCapacity,capacityIncrement);
	}
	
	public void pringString(Vector vector) {
		
		for(Object object : vector) {
			System.out.print((String)object);
		}
	}
	
	public static void main(String[] args) {
		VectorTest02 vectorTest=new VectorTest02(10,10);
		
		String s1=new String("1.ȫ");
		vectorTest.add(s1);
		vectorTest.add(new String("2.��"));
		vectorTest.add("3.�� �ȳ��ϼ���");
		vectorTest.pringString(vectorTest);

		System.out.println("\n ==> API Ȯ��");
		vectorTest.insertElementAt("4.��",1);
		vectorTest.pringString(vectorTest);

		System.out.println("\n ==> API Ȯ��");
		vectorTest.setElementAt("5.,ȫ���",3);
		vectorTest.pringString(vectorTest);

		System.out.println("\n ==> API Ȯ��");
		vectorTest.removeElementAt(3);
		vectorTest.pringString(vectorTest);
		
	}
}