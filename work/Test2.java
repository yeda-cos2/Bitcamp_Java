public class Test2 {
    public static void main(String args[]) {
        
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        
        if(Integer.parseInt(args[0])>Integer.parseInt(args[1])){
            System.out.println("첫번째인수: "+i+", 두번째인수: "+j+", "+i+"-"+j+"="+(i-j)+"입니다.");
        
		}else if(i<j){
            System.out.println("첫번째인수: "+i+", 두번째인수: "+j+", "+i+"+"+j+"="+(i+j)+"입니다.");
			
			}
     } //end of main
} //end of class