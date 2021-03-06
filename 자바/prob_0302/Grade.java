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
			System.out.println(array.get(i).substring(0, array.get(i).indexOf(",")) + "의 점수는 "
					+ array.get(i).substring(array.get(i).indexOf(",") + 1, array.get(i).length()) + "점 입니다.");
			sum += Integer.parseInt(array.get(i).substring(array.get(i).indexOf(",") + 1, array.get(i).length()));
			avg = sum / array.size();
		}
		System.out.println("모두의 총점은 " + sum + "점 입니다");
		System.out.println("모두의 평균은 " + avg + "점 입니다");
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
