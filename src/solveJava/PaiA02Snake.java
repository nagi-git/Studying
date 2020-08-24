package solveJava;

import java.util.Scanner;

public class PaiA02Snake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// マップの行数 H
		int h = sc.nextInt();
		// マップの列数 W
		int w = sc.nextInt();
		// 現在の座標 sy
		int sy = sc.nextInt();
		// 現在の座標 sx
		int sx = sc.nextInt();
		// 方向転換の回数 N
		int n = sc.nextInt();

		// mapの入力
		String mapLine[] = new String[h];
		String map[][] = new String[h][w];
		for (int i = 0; i < h; i++) {
			mapLine[i] = sc.next();
			for (int j = 0; j < w; j++) {
				map[i][j] = String.valueOf(mapLine[i].charAt(j));
			}
		}
		// 方向転換のタイミングを入力する（n回）
		int[] changeT = new int[n];
		String[] changeD = new String[n];
		for (int i = 0; i < n; i++) {
			// 方向転換をおこなう時刻 t
			changeT[i] = sc.nextInt();
			// 転換する向き d
			changeD[i] = sc.next();
		}

		// 蛇が移動する（時刻が99になるまで）
		moveSnake(map, h, w, sy, sx, n, sc, changeT, changeD);

		// 出力
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(map[i][j]);
			}
			if(i != h - 1) {
				System.out.print("\n");
			}
		}
	}

	private static String[][] moveSnake(String[][] map, int h, int w, int sy, int sx, int n, Scanner sc, int[] changeT,
			String[] changeD) {
		int countTime = 0;
		int nowDirection = 200;
		int[] nowPoint = { sy, sx };
		boolean endJudge = false;
		while (countTime <= 100) {
			// 現在の場所が進める場所か判定
			if (endJudge(nowDirection, map, nowPoint, endJudge)) {
				break;
			} else {
				// 方向転換する
				nowDirection = changeDirection(changeT, changeD, nowDirection, countTime);
				// 現在の方向にまっすぐ進む
				moveStraight(nowDirection, map, nowPoint);
			}
			countTime++;
		}
		return map;
	}

	private static String[][] moveStraight(int nowDirection, String[][] map, int[] nowPoint) {
		switch (nowDirection % 4) {
		case 0:
			map[nowPoint[0]][nowPoint[1]] = "*";
			nowPoint[0] --;
			break;
		case 1:
			map[nowPoint[0]][nowPoint[1]] = "*";
			nowPoint[1] ++;
			break;
		case 2:
			map[nowPoint[0]][nowPoint[1]] = "*";
			nowPoint[0] ++;
			break;
		case 3:
			map[nowPoint[0]][nowPoint[1]] = "*";
			nowPoint[1] --;
			break;
		}
		return map;
	}

	private static boolean endJudge(int nowDirection, String[][] map, int[] nowPoint, boolean endJudge) {
		if (nowDirection % 4 == 0 && nowPoint[0] >= 0) {
			if (!map[nowPoint[0]][nowPoint[1]].equals(".")) {
				endJudge = true;
			} else {
				endJudge = false;
			}
		} else if (nowDirection % 4 == 1 && nowPoint[1] < map[0].length) {
			if (!map[nowPoint[0]][nowPoint[1]].equals(".")) {
				endJudge = true;
			} else {
				endJudge = false;
			}
		} else if (nowDirection % 4 == 2 && nowPoint[0] < map.length) {
			if (!map[nowPoint[0]][nowPoint[1]].equals(".")) {
				endJudge = true;
			} else {
				endJudge = false;
			}
		} else if (nowDirection % 4 == 3 && nowPoint[1] >= 0) {
			if (!map[nowPoint[0]][nowPoint[1]].equals(".")) {
				endJudge = true;
			} else {
				endJudge = false;
			}
		} else {
			endJudge = true;
		}
		return endJudge;
	}

	private static int changeDirection(int[] changeT, String[] changeD, int nowDirection, int countTime) {
		for (int i = 0; i < changeT.length; i++) {
			if (changeT[i] == countTime) {
				if (changeD[i].equals("R")) {
					nowDirection ++;
				} else if (changeD[i].equals("L")) {
					nowDirection --;
				}
			}
		}
		return nowDirection;
	}

}
