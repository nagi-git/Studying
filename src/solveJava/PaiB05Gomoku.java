package solveJava;

import java.util.Scanner;

public class PaiB05Gomoku {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 5 x 5の盤面を入力させる
		String[] line = new String[5];
		for(int i = 0; i < 5; i++) {
			line[i] = sc.nextLine();

			String[][] lineArray = new String[5][5];
			for(int k = 0; k < 5; k++) {
				// 配列に変換
				lineArray[i][k] = String.valueOf(line[i].charAt(k + 1));

				// 行の一致数を集計
				int gyoMatch = 0;
				if(lineArray[i][0] == lineArray[i][k]) {
					gyoMatch += 1;
				} else {
					break;
				}
			}


		}
	}
}
