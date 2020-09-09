package solveJava;

import java.util.Scanner;

public class PaiB19Moyou {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 生成手順を繰り返す回数k
		int k = sc.nextInt();
		// 最初に与えられる正方形の辺の長さを表す整数 n
		int n = sc.nextInt();

		//模様の配列
		String[][] pattern = new String[(int) Math.pow(n, (int) Math.pow(2, k))][(int) Math.pow(n, (int) Math.pow(2, k))];

		// 模様を入力させる
		for(int i = 0; i < n; i++) {
			String startPattern = sc.next();
			for (int j = 0; j < n; j++) {
				// 配列に変換
				pattern[i][j] = startPattern.substring(j, j + 1);
			}
		}

		// 模様を生成する
		pattern = createPattern(k, n, pattern);

		for(int i = 0; i < pattern.length; i++) {
			for(int j = 0; j < pattern[0].length; j++) {
				System.out.print(pattern[i][j]);
			}
			System.out.print("\n");
		}

		sc.close();
	}

	private static String[][] createPattern(int k, int n, String[][] pattern) {
		for(int kCount = 0; kCount < k; kCount++) {
			int patternCount = (int) Math.pow(n, (int) Math.pow(2, kCount));
			for(int nGyoCount = 0; nGyoCount < patternCount; nGyoCount++) {
				for(int nRetuCount = 0; nRetuCount < patternCount; nRetuCount++) {
					if(pattern[nGyoCount][nRetuCount].equals("#")) {
						addSamePattern(pattern, nGyoCount, nRetuCount, patternCount);
					} else {
						addblankPattern(pattern, nGyoCount, nRetuCount, patternCount);
					}
				}
			}
		}
		return pattern;
	}

	private static String[][] addblankPattern(String[][] pattern, int nGyoCount, int nRetuCount, int patternCount) {
		for(int i = 0; i < patternCount; i++) {
			for(int j = 0; j <  patternCount; j++) {
				pattern[patternCount * nGyoCount + i][patternCount * nRetuCount + j] = ".";
			}
		}
		return pattern;
	}

	private static String[][] addSamePattern(String[][] pattern, int nGyoCount, int nRetuCount, int patternCount) {
		for(int i = 0; i < patternCount; i++) {
			for(int j = 0; j <  patternCount; j++) {
				pattern[patternCount * nGyoCount + i][patternCount * nRetuCount + j] = pattern[i][j];
			}
		}
		return pattern;
	}

}
