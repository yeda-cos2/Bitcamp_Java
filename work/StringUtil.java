public class StringUtil{

	private static String replaceString(String[] arr){

	int count=0;
	int max=0; 
	int index=0;
	String newString;

		for(int i=0; i< arr.length; i++){ 
			count=0;

			for(int j=0; j<arr[i].length(); j++){
				if(arr[i].charAt(j)=='a'){
				count++;
				}
	}

	if(count>=max){
		max=count;
		index=i;
		}
	}

	newString=arr[index].replace('a','A');
	return newString;
	}

	public static void main(String[] args){

		String[] arr={"java program","array","java program area","append"};
		String result=StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 "+result);

	}//end of main
}//end of class