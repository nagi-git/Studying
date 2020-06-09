package solveJava;

import java.util.Scanner;

public class PaiC09Siken {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 受験者の数
		int n = sc.nextInt();

		int passCount = 0;
		for(int i = 0; i < n; i++) {
			// 文理の区分
			String t = sc.next();

			// 英語の点
			int english = sc.nextInt();
			// 数学の点
			int math = sc.nextInt();
			// 理科の点
			int science = sc.nextInt();
			// 国語の点
			int japanese = sc.nextInt();
			// 地理歴史の点
			int geography = sc.nextInt();

			int sumPoint = english + math + science + japanese + geography;

			passCount = judgePass(t, english, math, science, japanese, geography, sumPoint, passCount);
		}

		System.out.println(passCount);

		sc.close();
	}

	private static int judgePass(String t, int english, int math, int science, int japanese, int geography,
			int sumPoint, int passCount) {
		if(sumPoint >= 350) {
			if(t.equals("s")) {
				if((math + science) >= 160) {
					passCount += 1;
				}
			} else if(t.equals("l")) {
				if((japanese + geography) >= 160) {
					passCount += 1;
				}
			}
		}
		return passCount;
	}

}
