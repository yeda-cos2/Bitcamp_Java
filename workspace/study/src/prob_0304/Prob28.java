package prob_0304;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prob28 {

	private static int[] generateRandomNumber() {
		Set<Integer> rd = new HashSet<Integer>();
		
		for (int j = 0; j < 10; j++) {
			rd.add((int) (Math.random() * 21));
		}

		int[] newrd = new int[rd.size()];

		for(int k:rd) {
			System.out.println(k);
		}
		
//		for (int p = 0; p < rd.size(); p++) {
//			newrd[p] = k;
//		}
//		}
//			newrd[k] = (int) (Math.random() * 21);
		return null;

	}

	

	public static void printStatistics(int[] array) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("stroe.txt"));
	}

	public static void main(String[] args) {
		int[] array = generateRandomNumber();
		for (int i : array) {
			System.out.println(i);
		}
//		printStatistics(array);
	}
}
