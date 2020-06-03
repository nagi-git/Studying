package solveJava;

import java.util.Scanner;

public class PaiC04CardGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 判定する数
		int n = sc.nextInt();

		// 手札の数値を入力させる
		int[] cardNum = new int[n];
		for(int i = 0; i < n; i++) {
			cardNum[i] = sc.nextInt();
		}

		int[][] cardNumArray = new int[n][4];
		for(int i = 0; i < n; i++ ) {
			cardNumArray[i][0] = cardNum[i] / 1000;
			cardNumArray[i][1] = (cardNum[i] % 1000) / 100;
			cardNumArray[i][2] = (cardNum[i] % 1000 % 100) / 10;
			cardNumArray[i][3] = cardNum[i] % 10;

		}

		// マッチした数を計算する
		int[] matchCount = new int[n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 4 - 1; j++) {
				for(int k = j + 1; k < 4; k++) {
					if(cardNumArray[i][j] == cardNumArray[i][k]) {
						matchCount[i] += 1;
					}
				}
			}
		}

		// 役を判定する
		String[] yaku = new String[n];
		for(int i = 0; i < n; i++ ) {
			if(matchCount[i] == 0) {
				yaku[i] = "No Pair";
			} else if(matchCount[i] == 1) {
				yaku[i] = "One Pair";
			} else if(matchCount[i] == 2) {
				yaku[i] = "Two Pair";
			} else if(matchCount[i] == 3) {
				yaku[i] = "Three Card";
			} else if(matchCount[i] == 6) {
				yaku[i] = "Four Card";
			}
		}

		// 出力
		for(int i = 0; i < n; i++) {
			System.out.println(yaku[i]);
		}
	}

}
