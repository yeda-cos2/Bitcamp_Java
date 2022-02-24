public class Util{

	public int findPrimeCount(int limit){
		boolean prime;
		int count=0;

		for (int i = 2; i <= limit; i++) {
			prime=true;

			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					prime=false;
					break;
			}
		}

			if(prime){
				count++;
		}

		} //end of for
	return count;
	}


	public int[] findPrimeReturnArray(int limit){

		int count=findPrimeCount(limit);
		int[] newArray=new int[count];
		boolean prime;
		int temp=0;

		for (int i = 2; i <= limit; i++) { 
			prime=true;

			for (int j = 2; j < i; j++) { 
				if (i%j==0) { 
					prime=false;
					break;
				} 
			} 

			if(prime){
				newArray[temp]=i;
				temp++;
			}
		} //end of for
		return newArray; 
	}
}//end of class