package solveJava;

import java.util.Scanner;

public class PaiC02Kanzen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 判定したい数字の個数
		int q = sc.nextInt();

		// 判定したい数字
		int[] n = new int[q];
		for(int i = 0; i < q; i++) {
			n[i] = sc.nextInt();
		}

		// 約数の足し算をする
		int[] s = new int[q];
		for(int i = 0; i < q; i++) {
			for(int j = 1; j < n[i]; j++) {
				if((n[i] % j) == 0) {
					s[i] += j;
				}
			}
		}

		// 完全数・ほぼ完全数の判定
		String[] nJadge = new String[q];
		for(int i = 0; i < q; i++) {
			if(s[i] == n[i]) {
				nJadge[i] = "perfect";
			} else if(s[i] == n[i] - 1 || s[i] == n[i] + 1) {
				nJadge[i] = "nearly";
			} else {
				nJadge[i] = "neither";
			}
		}

		// 出力
		for(int i = 0; i < q; i++) {
			System.out.println(nJadge[i]);
		}
	}
}
