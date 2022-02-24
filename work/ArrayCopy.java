import java.util.Vector;

public class ArrayCopy{

	public Vector<String> moveToVector(String []datas){

		Vector<String> moveToVector = new Vector<String>(5,5);

		Vector<String> str;
		

	//	for(String d : moveToVector){
	//	System.out.println(d);
	//	}
	return str; 
	}

	public static void main(String[] args){
		ArrayCopy ac=new ArrayCopy();
		String datas[]={"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
	}

}