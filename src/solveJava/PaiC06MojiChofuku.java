package solveJava;

import java.util.Scanner;

public class PaiC06MojiChofuku {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 出現する文字列s
		String s = sc.next();
		// 調べたい文字列t
		String t = sc.next();

		// 文字列sの文字数
		int sLength = s.length();
		// 文字列tの文字数
		int tLength = t.length();


		// 文字列sが出現する回数
		int sCount = 0;

		// sLengthがtLengthより大きい場合はsCount = 0にする
		if(sLength > tLength) {
			sCount = 0;
		} else {
			// 文字列tの配列
			String[] tArray = new String[tLength - sLength + 1];
			for(int i = 0; i < tArray.length; i++) {
				// 文字列tをsLength個ずつ配列に入れる
				tArray[i] = t.substring(i, i + sLength);

				// tArray[i]と文字列sが一致したらsCountに1足す
				if(tArray[i].equals(s)) {
					sCount += 1;
				}
			}
		}
		// 出力
		System.out.println(sCount);
	}

}
