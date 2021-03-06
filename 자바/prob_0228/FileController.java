package prob_0228;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileController {

	public void reverseLine(String oldf, String newf) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader(oldf));
		BufferedWriter bw = new BufferedWriter(new FileWriter(newf));

		List<String> array = new ArrayList<String>();
		String line = null;

		while (true) {
			line = br.readLine();
			if (line == null) {
				break;
			}
			array.add(line);
		}
		br.close();

		for (int i = array.size() - 1; i >= 0; i--) {
			bw.write(array.get(i));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {

		FileController c = new FileController();

		String oldf = "C:\\workspace\\01PJT\\files\\oldf.txt";

		String newf = "C:\\workspace\\01PJT\\files\\newf.txt";

		try {
			c.reverseLine(oldf, newf);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}