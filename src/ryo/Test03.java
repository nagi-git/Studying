package ryo;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		if (!(n >= 1 && n <= 100000)) {
			System.err.println("Nの値が範囲外です。");
			return;
		}


		int count = 0;
		// [currentNum - digSum]を繰り返す（currentNumが0になるまで）
		for (int currentNum = n; currentNum != 0; count++) {
			int[] digNums = getDigNums(currentNum);
			int digSum = getDigSum(digNums);

			currentNum -= digSum;
		}

		System.out.println(count);
	}

	/**
	 * nの値の各桁の値を配列に入れる
	 * @param n ユーザーが入力した値
	 * @return digNums nの値が入った配列
	 */
	private static int[] getDigNums(int n) {
		int[] digNums = new int[] {0, 0, 0, 0, 0};

		String strN = String.valueOf(n);
		for (int i = 0; i < strN.length(); i++) {
			digNums[i] = Integer.parseInt(strN.substring(i, i + 1));
		}
		return digNums;
	}

	/**
	 * digNums配列各要素の数字を合計する
	 * @param digNums nの値が入った配列
	 * @return sum digNums配列各要素の数字の合計
	 */
	private static int getDigSum(int[] digNums) {
		int sum = 0;
		for (int digNum : digNums) {
			sum += digNum;
		}
		return sum;
	}
}
