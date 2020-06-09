package solveJava;

import java.util.Scanner;

public class PaiC10CardNarabe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// a
		int a = sc.nextInt();
		// b
		int b = sc.nextInt();
		// c
		int c = sc.nextInt();
		// a
		int d = sc.nextInt();


		int[] sum = new int[12];
		sum[0] = a * 10 + b + c * 10 + d;
		sum[1] = a * 10 + b + d * 10 + c;
		sum[2] = a * 10 + c + b * 10 + d;
		sum[3] = a * 10 + c + d * 10 + b;
		sum[4] = a * 10 + d + b * 10 + c;
		sum[5] = a * 10 + d + c * 10 + b;
		sum[6] = c * 10 + a + b * 10 + d;
		sum[7] = c * 10 + d + b * 10 + a;
		sum[8] = d * 10 + b + c * 10 + a;
		sum[9] = d * 10 + a + b * 10 + c;
		sum[10] = d * 10 + a + c * 10 + b;
		sum[11] = d * 10 + c + b * 10 + a;

		int maxSum = 0;
		for(int i = 0; i < 12; i++) {
			if(maxSum < sum[i]) {
				maxSum = sum[i];
			}
		}
		System.out.println(maxSum);
	}

}
