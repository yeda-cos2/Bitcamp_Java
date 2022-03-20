package prob_0302;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileCompareUtil {

	public ArrayList compareFile(String fstFileName, String scdFileName) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(fstFileName));

		List<String> m = new ArrayList<String>();
		String line = null;
		int count1 = 0;
		int count2 = 0;

		while ((line = br.readLine()) != null) {
			count1++;
			m.add("Line " + count1 + ": " + line);
		}

		BufferedReader brt = new BufferedReader(new FileReader(scdFileName));
		String linetwo = null;
		List<String> n = new ArrayList<String>();
		ArrayList<String> nn = new ArrayList<String>();

		while ((linetwo = brt.readLine()) != null) {
			count2++;
			n.add("Line " + count2 + ": " + linetwo);
		}

		for (int i = 0; i < m.size(); i++) {
			if (m.get(i).equals(n.get(i))) {
			} else {
				nn.add(n.get(i));
			}
		}
		br.close();
		brt.close();
		return nn;
	}

	public static void main(String[] args) {
		FileCompareUtil util = new FileCompareUtil();
		try {
			System.out.println(util.compareFile("C:\\workspace\\01PJT\\files\\fstFile1.txt",
					"C:\\workspace\\01PJT\\files\\scdFile1.txt"));
			System.out.println("Successful!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}// end of class
