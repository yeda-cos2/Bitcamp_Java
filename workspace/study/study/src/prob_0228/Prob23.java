package prob_0228;

public class Prob23 {

	public String toEncoding(String str) {

		byte[] temp = str.getBytes();
		String newstr = "";

		if (temp.length == str.length()) {
			newstr = str;

		} else if (temp.length == 2 * str.length()) {
			String[] array = new String[temp.length];
			for (int i = 0; i < temp.length; i++) {
				array[i] = Integer.toHexString(temp[i]);
				newstr+= "%"+array[i].substring(6).toUpperCase();
			}
		}else {
			for(int j=0; j<str.length();j++) {
			if((int)str.charAt(j)<127) {
				newstr+=str.charAt(j);
//			}else {
//				for(int k=0; k<temp.length;k++) {
//					String[] arrey = new String[temp.length];
//					arrey[k]=Integer.toHexString(temp[k]);
//								
//					newstr+="%"+arrey[k].substring(6);
//			}
			}
			}
		}
		return newstr;
	
	}

//				if (array[k].length() == 8) {
//					newstr += "%" + array[k].substring(6).toUpperCase();


	public static void main(String[] args) {
		Prob23 p1 = new Prob23();
		System.out.println("�Է�: Korea ");
		System.out.println("���: " + p1.toEncoding("Korea"));
		System.out.println("�Է�: ȫ�浿");
		System.out.println("���: " + p1.toEncoding("ȫ�浿"));
		System.out.println("�Է�: ȫ �� ��");
		System.out.println("���: " + p1.toEncoding("ȫ �� ��"));
		System.out.println("�Է�: Hong �� ��");
		System.out.println("���: " + p1.toEncoding("Hong �� ��"));
		System.out.println("�Է�: 0319 ");
		System.out.println("���: " + p1.toEncoding("0319"));
	}

}