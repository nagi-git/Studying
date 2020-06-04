package ryo;

import java.util.Scanner;

public class PaiC04CardGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 判定する数
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			// 読み込み
			String line = sc.next();

			// 判定
			String result = judge(line);

			// 出力
			System.out.println(result);
		}
		sc.close();
	}

	private static String judge(String line) {
		// マッチした数を計算
		int matchCount = countMatch(line);

		// 役を判定
		if(matchCount == 1) {
			return "One Pair";
		} else if(matchCount == 2) {
			return "Two Pair";
		} else if(matchCount == 3) {
			return "Three Card";
		} else if(matchCount == 6) {
			return "Four Card";
		} else {
			return "No Pair";
		}
	}

	private static int countMatch(String line) {
		int matchCount = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(i != j && line.substring(i, i + 1).equals(line.substring(j, j + 1))) {
					matchCount++;
				}
			}
		}
		return matchCount;
	}
}
