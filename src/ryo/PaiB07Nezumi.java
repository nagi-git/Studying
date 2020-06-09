package ryo;

import java.util.Scanner;

public class PaiB07Nezumi {
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
		String[][] towns = getTowns(h, w, sc);

		// 鼠小僧が動く
		int[] placeNow = {h0 - 1, w0 - 1};
		Direction direction = Direction.北;
		for(int i = 0; i < 2000; i++) {
			if(placeNow[0] >= h || placeNow[1] >= w || placeNow[0] < 0 || placeNow[1] < 0) {
				// はみ出たら終了
				break;
			}

			String town = getTown(towns, placeNow);
			reverseTown(towns, placeNow);
			direction = direction.turn(town);
			placeNow = move(direction, placeNow);
		}

		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print(towns[i][j]);
			}
			if(i != h - 1) {
				System.out.print("\n");
			}
		}
		sc.close();
	}

	private static int[] move(Direction direction, int[] placeNow) {
		placeNow[0] += direction.h;
		placeNow[1] += direction.w;
		return placeNow;
	}

	private static String getTown(String[][] towns, int[] placeNow) {
		return towns[placeNow[0]][placeNow[1]];
	}

	private static String[][] reverseTown(String[][] towns, int[] placeNow) {
		if (getTown(towns, placeNow).equals("*")) {
			towns[placeNow[0]][placeNow[1]] = ".";
		} else {
			towns[placeNow[0]][placeNow[1]] = "*";
		}
		return towns;
	}

	private static String[][] getTowns(int h, int w, Scanner sc) {
		String[][] towns = new String[h][w];
		for (int i = 0; i < h; i++) {
			String town = sc.next();
			for(int j = 0; j < w; j++) {
				// 配列に変換
				towns[i][j] = town.substring(j, j + 1);
			}
		}
		return towns;
	}

	private enum Direction {
		北(0, -1,  0),
		東(1,  0,  1),
		南(2,  1,  0),
		西(3,  0, -1),
		;

		int code;
		int h;
		int w;

		Direction(int code, int h, int w) {
			this.code = code;
			this.h = h;
			this.w = w;
		}

		private static Direction of(int code) {
			for (Direction e : Direction.values()) {
				if (e.code == code) {
					return e;
				}
			}
			return null;
		}

		Direction turn(String town) {
			if (town.equals(".")) {
				return of((this.code + 1) % 4);
			} else {
				return of((this.code + 3) % 4);
			}
		}
	}
}
