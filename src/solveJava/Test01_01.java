
package solveJava;

import java.util.Scanner;

public class Test01_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 文字列
		String str = sc.next();


		boolean isMatch = false;

		String[] strArrayLeft = new String[str.length()];

		for(int i = 0; i < strArrayLeft.length; i++) {
			// 文字列tをi個ずつ配列に入れる
			strArrayLeft[i] = str.substring(i, i + 1);
		}

		for(int i = 0; i < strArrayLeft.length; i++) {
			if(strArrayLeft[i] == strArrayLeft[strArrayLeft.length - 1 - i]) {
				isMatch = true;
			}else {
				isMatch = false;
			}
		}
		System.out.print(isMatch);

	}

}
