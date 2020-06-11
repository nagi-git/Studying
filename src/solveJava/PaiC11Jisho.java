package solveJava;

import java.util.Arrays;
import java.util.Scanner;

public class PaiC11Jisho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 単語の数
		int n = sc.nextInt();
		// 1ページに記載する単語の数
		int k = sc.nextInt();
		// 調べたいページの数
		int p = sc.nextInt();

		// 単語を入力
		String[] word = new String[n];
		for(int i = 0; i < n; i++) {
			 word[i] = sc.next();
		}
		Arrays.sort(word);

		String jisyoArray = null;
		for(int i = k * (p - 1); i < k * p && i < n; i++) {
			jisyoArray = word[i];
			System.out.println(jisyoArray);
		}


		sc.close();
	}

}
