package ryo;

import java.util.Scanner;

public class PaiC15Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数字a
		String a = sc.next();
		// 数字b
		String b = sc.next();

		// aの桁数
		int aLength = String.valueOf(a).length();
		// bの桁数
		int bLength = String.valueOf(b).length();

		int highLength = aLength;

		if(aLength < bLength) {
			highLength = bLength;
		}

		int[] addNum = new int[highLength];
		String aNum = "0";
		String bNum = "0";

		for(int i = 0; i < highLength; i++) {
			if(aLength >= i ) {
				aNum = a.substring(aLength - i-1, aLength - i);
			}else {
				aNum = "0";
			}
			if(bLength > i) {
				bNum = b.substring(bLength - i-1, bLength - i);
			}else {
				bNum = "0";
			}

			addNum[i] = Integer.parseInt(aNum) + Integer.parseInt(bNum);
		}

		String[] addNumOne = new String [highLength];

		for(int i = 0; i < addNum.length; i++) {
			addNumOne[i] = String.valueOf(addNum[i]).substring(String.valueOf(addNum[i]).length() - 1);
			System.out.print(addNumOne[highLength - i - 1]);
		}

		sc.close();

	}

}
