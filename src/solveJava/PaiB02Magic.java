package solveJava;

import java.util.Scanner;

public class PaiB02Magic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] jin = new int[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				jin[i][j] = sc.nextInt();
			}
		}

		int[] jinSumNumArray = new int[n];
		for(int nGyo = 0; nGyo < n; nGyo++) {
			for(int nRetu = 0; nRetu < n; nRetu++) {
				if(jin[nGyo][nRetu] == 0) {
					jinSumNumArray[nGyo] = 0;
					break;
				} else {
					jinSumNumArray[nGyo] += jin[nGyo][nRetu];
				}
			}
		}

		int jinSumNum = 0;
		for(int i = 0; i < jinSumNumArray.length; i++) {
			if(jinSumNumArray[i] != 0) {
				jinSumNum = jinSumNumArray[i];
			}
		}

		int nGyoSumNum = 0;
		int nRetuSumNum = 0;
		int nSumNum = 0;
		for(int nGyo = 0; nGyo < n; nGyo++) {
			for(int nRetu = 0; nRetu < n; nRetu++) {
				if(jin[nGyo][nRetu] == 0) {
					for(int i = 0; i < n; i++) {
						nGyoSumNum += jin[nGyo][i];
					}
					for(int j = 0; j < n; j++) {
						nRetuSumNum += jin[j][nRetu];
					}
					if(nGyoSumNum <= nRetuSumNum) {
						nSumNum = nRetuSumNum;
					}
					if(nGyoSumNum >= nRetuSumNum) {
						nSumNum = nGyoSumNum;
					}
					jin[nGyo][nRetu] = jinSumNum - nSumNum;
					nGyoSumNum = 0;
					nRetuSumNum = 0;
				}
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j == n - 1) {
					System.out.print(jin[i][j]);
				} else {
					System.out.print(jin[i][j]+" ");
				}
			}
			if(i == n - 1) {
				System.out.print("");
			} else {
				System.out.print("\n");
			}
		}
	}
}
