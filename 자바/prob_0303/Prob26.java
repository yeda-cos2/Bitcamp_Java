package prob_0303;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

public class Prob26 {

	public Vector getScore(String fileName) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(fileName));
		Vector array = new Vector();

		String str = null;
		while ((str = br.readLine()) != null) {
			String[] newstr = str.split("/");
			String name = newstr[0];
			int kor = Integer.parseInt(newstr[1]);
			int eng = Integer.parseInt(newstr[2]);
			int math = Integer.parseInt(newstr[3]);
			int sum = kor + eng + math;

			Score sc = new Score(name, kor, eng, math, sum);
			array.add(sc);

		}
		br.close();
		return array;
	}

	public static void main(String[] args) throws IOException {
		Prob26 p2 = new Prob26();
		Vector scores = p2.getScore("C:\\workspace\\study\\src\\data.txt");
		for (int i = 0; i < scores.size(); i++) {
			Score score = (Score) scores.get(i);
			System.out.println(score.getName() + " : " + score.getKor() + " " + score.getEng() + " " + score.getMath()
					+ " " + score.getSum());
		}
	}

}
