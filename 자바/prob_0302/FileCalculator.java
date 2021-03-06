package prob_0302;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCalculator {

	public void addCalculateResult(String inputFileName) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
		BufferedWriter bw = new BufferedWriter(new FileWriter(inputFileName, true));

		String str = null;
		int mul = 1;
		int sum = 0;

		while (true) {
			str = br.readLine();
			if (str == null) {
				break;
			}
			sum += Integer.parseInt(str);
			mul *= Integer.parseInt(str);

		}

		bw.newLine();
		bw.write(String.valueOf(sum));
		bw.newLine();
		bw.write(String.valueOf(mul));
		bw.newLine();

		bw.flush();
		br.close();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		FileCalculator fc = new FileCalculator();
		fc.addCalculateResult("D:\\test.dat");

	}
}
