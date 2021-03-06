package prob_0303;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

public class Prob25 {

	public Vector getList() throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\workspace\\study\\src\\prob_0303\\list.txt"));
		Vector<String> newarray = new Vector<String>();
		Vector array = new Vector();

		String str = null;

		while ((str = br.readLine()) != null) {
			String[] newstr = str.split("/");
			String name = newstr[0];
			String subject = newstr[1];
			int result = Integer.parseInt(newstr[2]);

			String state = "미수료";
			if (subject.contains("J") || subject.contains("j")) {
				if (result >= 80) {
					state = "수료";
				}
			} else {
				if (result >= 90) {
					state = "수료";
				}
			}

			for (int i = 0; i < newstr.length; i++) {
				newarray.add(newstr[i]);
			}
			newarray.add(state);
			array.add(newarray.clone());
			newarray.removeAllElements();
		}
		br.close();
		return array;
	}

	public static void main(String[] args) throws IOException {
		Prob25 e = new Prob25();
		Vector scores = e.getList();
		for (int i = 0; i < scores.size(); i++) {
			System.out.println(scores.get(i));

		}
	}
}
