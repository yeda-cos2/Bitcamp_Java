package prob_0302;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Grade {

	public void printGrade(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		List<String> array = new ArrayList<String>();

		String str = null;
		while ((str = br.readLine()) != null) {
			array.add(str);
		}
		br.close();

		int sum = 0;
		int avg = 0;
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).substring(0, array.get(i).indexOf(",")) + "�� ������ "
					+ array.get(i).substring(array.get(i).indexOf(",") + 1, array.get(i).length()) + "�� �Դϴ�.");
			sum += Integer.parseInt(array.get(i).substring(array.get(i).indexOf(",") + 1, array.get(i).length()));
			avg = sum / array.size();
		}
		System.out.println("����� ������ " + sum + "�� �Դϴ�");
		System.out.println("����� ����� " + avg + "�� �Դϴ�");
	}

	public static void main(String[] args) {
		Grade grade = new Grade();
		String fileName = "C:\\workspace\\01PJT\\files\\score.txt";
		try {
			grade.printGrade(fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}