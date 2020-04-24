package solveJava;

import java.util.Scanner;

public class Test03R1 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 0;
		int updateN = 0;
		for(updateN = n; updateN != 0; count++) {
			int[] digNum = digNums(updateN);
			int sumDigNum = sumDigNum(digNum);

			updateN -= sumDigNum;
		}
		System.out.println(count);
	}

	private static int[] digNums(int n) {
		int digNums[] = {0, 0, 0, 0, 0, 0};
		String strN = String.valueOf(n);
		for(int i = 0; i < strN.length(); i++) {
			digNums[i] = Integer.valueOf(strN.substring(i, i + 1));
		}
		return digNums;
	}

	private static int sumDigNum(int[] digNums) {
		int sumDigNums = 0;
		for(int i = 0; i < digNums.length; i++) {
			sumDigNums += digNums[i];
		}
		return sumDigNums;
	}

}
