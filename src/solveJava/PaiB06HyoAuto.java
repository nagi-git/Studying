package solveJava;

import java.util.Scanner;

public class PaiB06HyoAuto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 行数
		int h = sc.nextInt();
		// 列数
		int w = sc.nextInt();

		// 二次元配列生成
		int[][] table = new int[h][w];

		// 最初の表(2 x 2)を入力
		for(int i = 0; i < 2; i++) {
			table[i][0] = sc.nextInt();
			table[i][1] = sc.nextInt();
		}

		// 何の倍数か求めてオートフィルする(行)
		table = autofillGyo(table, w);

		// 何の倍数か求めてオートフィルする(列)
		table = autofillRetu(table, w, h);

		// 出力
		output(table, w, h);

		sc.close();
	}

	private static int[][] autofillGyo(int[][] table, int w) {
		for(int i = 0; i < 2; i++) {
			int gyoBaisu = 0;
			gyoBaisu = table[i][1] - table[i][0];
			for(int j = 2; j < w; j++) {
				table[i][j] = table[i][0] + gyoBaisu * j;
			}
		}
		return table;
	}

	private static int[][] autofillRetu(int[][] table, int w, int h) {
		for(int i = 0; i < w; i++) {
			int retuBaisu = 0;
			retuBaisu = table[1][i] - table[0][i];
			for(int j = 2; j < h; j++) {
				table[j][i] = table[0][i] + retuBaisu * j;
			}
		}
		return table;
	}

	private static void output(int[][] table, int w, int h) {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(j == w - 1) {
					System.out.print(table[i][j]);
				} else {
					System.out.print(table[i][j] + " ");
				}
			}
			if(i != h - 1) {
				System.out.print("\n");
			}
		}

	}


}
