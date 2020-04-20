package solveJava;

import java.util.Scanner;

public class PaizaB01 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] visitor = new int[n];
		for(int i = 0; i < n; i++) {
			visitor[i] = sc.nextInt();
		}

		int[] visitorCount = new int[n - k + 1];
		for(int i = 0; i < (n - k + 1); i++) {
			for(int j = i; j < (k + i); j++) {
				visitorCount[i] += visitor[j];
			}
		}

		int max = visitorCount[0];
		for(int i = 0; i < visitorCount.length; i++) {
			max = Math.max(max, visitorCount[i]);
		}

		int dayCount = 0;
		for(int i = 0; i < (n - k + 1); i++) {
			if(visitorCount[i] == max) {
				dayCount += 1;
			}
		}

		int visitorMaxDay = 0;
		int i = 0;
		while(i < visitorCount.length) {
			visitorMaxDay = i;
			if(visitorCount[i] == max) {
				break;
			}
			i++;
		}

		System.out.print(dayCount);
		System.out.print(visitorMaxDay + 1);
	}
}
