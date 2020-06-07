package solveJava;

import java.util.Scanner;

public class PaiB06Nezumi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 縦マス数
		int h = sc.nextInt();
		// 横マス数
		int w = sc.nextInt();

		// 今のX座標
		int h0 = sc.nextInt();
		// 今のY座標
		int w0 = sc.nextInt();

		// 街の配列を作る
		String[][] towns = new String[h][w];
		for (int i = 0; i < h; i++) {
			String town = sc.next();
			for(int j = 0; j < w; j++) {
				// 配列に変換
				towns[i][j] = town.substring(j, j + 1);
			}
		}

		// 鼠小僧が動く
		int[] placeNow = {h0 - 1, w0 - 1};
		int directionNow = 2500;
		for(int i = 0; (placeNow[0] < h || placeNow[1] < w); i++) {
			if(placeNow[0] >= h || placeNow[1] >= w) {
				break;
			} else if(towns[placeNow[0]][placeNow[1]].equals(".")) {
				towns[placeNow[0]][placeNow[1]] = "*";
				directionNow += 1;
				if(directionNow % 4 == 1) {
					placeNow[1] += 1;
				} else if(directionNow % 2 == 0) {
					placeNow[0] += 1;
				} else if(directionNow % 4 == 3) {
					placeNow[1] -= 1;
				}
			} else if(towns[placeNow[0]][placeNow[1]].equals("*")) {
				towns[placeNow[0]][placeNow[1]] = ".";
				directionNow -= 1;
				if(directionNow % 4 == 1) {
					placeNow[1] += 1;
				} else if(directionNow % 2 == 0) {
					placeNow[0] += 1;
				} else if(directionNow % 4 == 3) {
					placeNow[1] -= 1;
				}
			}
		}


		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print(towns[i][j]);
			}
			if(i != h - 1) {
				System.out.print("\n");
			}
		}

	}

}
