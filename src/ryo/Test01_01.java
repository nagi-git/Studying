
package ryo;

import java.util.Scanner;

public class Test01_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 文字列
		String str = sc.next();

		String reversedStr = reverse(str);

		System.out.print(str.equals(reversedStr));
	}

	private static String reverse(String str) {
		String reversed = "";
		for(int i = str.length(); i >= 0; i--) {
			reversed = reversed.concat(str.substring(i - 1, i));
		}
		return reversed;
	}

}
