package ryo;

import java.util.Scanner;

public class PaiB05Gomoku {

	public static void main(String[] args) {
		// 読込
		String[][] lines = readLines();

		// 判定
		String player = judge(lines);

		// 出力
		System.out.println(player);
	}

	private static String[][] readLines() {
		Scanner sc = new Scanner(System.in);
		// 5 x 5の盤面を入力させる
		String[][] lines = new String[5][5];
		for(int i = 0; i < 5; i++) {
			String line = sc.nextLine();
			for(int j = 0; j < 5; j++) {
				// 配列に変換
				lines[i][j] = line.substring(j, j + 1);
			}
		}
		sc.close();
		return lines;
	}

	private static String judge(String[][] lines) {
		if (exist5(lines, "O")) {
			return "O";
		} else if (exist5(lines, "X")) {
			return "X";
		} else {
			return "D";
		}
	}

	private static boolean exist5(String[][] lines, String mark) {
		for (int i = 0; i < 5; i++) {
			String row = convRow(lines, i);
			if (row.replace(mark, "").isEmpty()) {
				return true;
			}
			String column = convColumn(lines, i);
			if (column.replace(mark, "").isEmpty()) {
				return true;
			}
		}
		String slash = convSlash(lines, true);
		if (slash.replace(mark, "").isEmpty()) {
			return true;
		}
		String reversedSlash = convSlash(lines, false);
		if (reversedSlash.replace(mark, "").isEmpty()) {
			return true;
		}
		return false;
	}

	private static String convRow(String[][] lines, int index) {
		return String.join("", lines[index]);
	}

	private static String convColumn(String[][] lines, int index) {
		String result = "";
		for (int i = 0; i < 5; i++) {
			result = result.concat(lines[i][index]);
		}
		return result;
	}

	private static String convSlash(String[][] lines, boolean flag) {
		String result = "";
		for (int i = 0; i < 5; i++) {
			if (flag) {
				result = result.concat(lines[i][i]);
			} else {
				result = result.concat(lines[i][4 - i]);
			}
		}
		return result;
	}
}
