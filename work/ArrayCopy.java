import java.util.*;

public class ArrayCopy{

	public List<String> moveToVector(String []datas){

		List<String> v = new Stack<String>();

	//	for(int i=datas.length-1;i>=0;i--){
	//		v.add(datas[i]);
	//	}
	for(int i=0;i<datas.length;i++){
String a=v.push(datas[i]);
	}
return a;
		//return v;
	}
		

	public static void main(String[] args){
		ArrayCopy ac=new ArrayCopy();
		String datas[]={"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
	}

}