package solveJava;

import java.util.Scanner;


public class P14SumDiff1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 標準入力から値を取得してinput_lineに入れる
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();

        int rikkoho[] = new int[m];
        int i;
        for(i = 1; i <= m; i++) {
        	rikkoho[i] = 0;
        }

        for(int j = 1; j <= k; j++) {
        	int k_num = sc.nextInt();
        	if(rikkoho[i] == k_num && j == 0) {
        		rikkoho[i] += 1;
        		n -= 1;
        	} else if(rikkoho[i] == k_num && j <= m) {
        		rikkoho[i] = rikkoho[i] + j;
        		if(rikkoho[i] != rikkoho[j] && rikkoho[i] != 0) {
        			rikkoho[i] -= 1;
        		}
        	}
        }

    }
}