public class Prob18{

	public String leftPad(String str, int size, char padChar){

		int len=str.length();
		String newstr="";

	if(len>=size){
		return str;
	}

	for(int i=0; i<size-len; i++){
		newstr+=padChar;
	}
	return (newstr+str);
	}

	public static void main(String[] args){

		Prob18 prob3 = new Prob18();

		System.out.println(prob3.leftPad("ABC",6,'#'));
		System.out.println(prob3.leftPad("ABC",5,'$'));
		System.out.println(prob3.leftPad("ABC",2,'&'));

	}//end of main
}//end of class