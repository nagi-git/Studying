package solveJava;

import java.util.Scanner;

public class PaiB18TableGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ヘッダーの数w
		int w = sc.nextInt();
		// ヘッダー配列
		String[] header = new String[w];
		for(int i = 0; i < w; i++) {
			header[i] = sc.next();
		}

		// データの数h
		int h = sc.nextInt();


		// データ行配列
		String[][] tabeleData = new String[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				tabeleData[i][j] = sc.next();
			}
		}

		// 1列の中で一番大きい文字数を算出（0～w列まで繰り返す）
		int[] strCountArray = strCount(w, h, header, tabeleData);

		// ヘッダーとデータ行をたす
		String[][] table = new String[h + 2][w];
		for(int i = 0; i < w; i++) {
			table[0][i] = header[i];
		}
		for(int i = 0; i < w; i++) {
			table[1][i] = "";
		}
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				table[i + 2][j] = tabeleData[i][j];
			}
		}

		// 空白と棒を入れる
		table = tableAdd(w, h, strCountArray, table);

		// 出力
		for(int i = 0; i < h + 2; i++) {
			if(i > 0) {
				System.out.print("\n");
			}
			for(int j = 0; j < w; j++) {
				System.out.print(table[i][j]);
			}
		}


		sc.close();
	}

	private static String[][] tableAdd(int w, int h, int[] strCountArray, String[][] table) {
		for(int i = 0; i < h + 2; i++) {
			for(int j = 0; j < w; j++) {
				int breakCount = strCountArray[j] - table[i][j].length();
				String breakStr = "";
				String stickStr = "";
				for(int k = 0; k < breakCount; k++) {
					breakStr += " ";
					stickStr += "-";
				}
				// 棒+空白*1
				if(i == 1 && j == 0) {
					table[i][j] = "|-" + stickStr + "-";
				} else if(i == 1 && j == w - 1) {
					table[i][j] = "|-" + stickStr + "-|";
				} else if(i == 1) {
					table[i][j] = "|-" + stickStr + "-";
				} else if(j == 0) {
					table[i][j] = "| " + table[i][j] + breakStr + " ";
				} else if(j == w - 1) {
					table[i][j] = "| " + table[i][j] + breakStr + " |";
				} else {
					table[i][j] = "| " + table[i][j] + breakStr + " ";
				}
			}
		}
		return table;
	}

	private static int[] strCount(int w, int h, String[] header, String[][] tabeleData) {
		int[] strCountArray = new int[w];
		for(int i = 0; i < w; i++) {
			strCountArray[i] = header[i].length();
			strCountArray[i] = strCountData(strCountArray, i, h, tabeleData);
		}
		return strCountArray;
	}

	private static int strCountData(int[] strCountArray, int i, int h, String[][] tabeleData) {
		for(int j = 0; j < h; j++) {
			if(tabeleData[j][i].length() > strCountArray[i]) {
				strCountArray[i] = tabeleData[j][i].length();
			}
		}
		return strCountArray[i];
	}

}
