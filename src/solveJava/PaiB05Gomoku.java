package solveJava;

import java.util.Scanner;

public class PaiB05Gomoku {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 5 x 5の盤面を入力させる
		String[] line = new String[5];
		String[][] lineArray = new String[5][5];
		for(int i = 0; i < 5; i++) {
			line[i] = sc.nextLine();

			for(int k = 0; k < 5; k++) {
				// 配列に変換
				lineArray[i][k] = String.valueOf(line[i].charAt(k));
			}
		}

		// 勝者のマーク
		String winnerMark = null;
		for(int l = 0; l < 5; l++) {
			// 行の一致数を集計
			int gyoMatchCount = 0;
			// 列の一致数を集計
			int retuMatchCount = 0;
			// 左斜めの一致数を集計
			int LNanameMatchCount = 0;
			// 右斜めの一致数を集計
			int RNanameMatchCount = 0;
			for(int m = 0; m < 5; m++) {
				if(lineArray[l][0] == lineArray[l][m]) {
					gyoMatchCount += 1;
					if(gyoMatchCount == 5) {
						winnerMark = lineArray[l][0];
					}
				} if(lineArray[0][l] == lineArray[m][l]) {
					retuMatchCount += 1;
					if(retuMatchCount == 5) {
						winnerMark = lineArray[0][m];
					}
				} if(lineArray[0][0] == lineArray[m][m]) {
					LNanameMatchCount += 1;
					if(LNanameMatchCount == 5) {
						winnerMark = lineArray[0][0];
					}
				} if(lineArray[0][4] == lineArray[m][4 - m]) {
					RNanameMatchCount += 1;
					if(RNanameMatchCount == 5) {
						winnerMark = lineArray[0][4];
					}
				} else {
					break;
				}
			}

		}if(winnerMark == null || winnerMark == ".") {
			winnerMark = "D";
		}

		System.out.println(winnerMark);
	}
}
