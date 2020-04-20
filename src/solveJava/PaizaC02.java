package solveJava;
import java.util.Scanner;

public class PaizaC02 {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();


    int [][] card = new int[a][b];
    for (int i = 0; i < a; i++) {
    	for(int j = 0; j < b; j++) {
    		card[i][j] = sc.nextInt();
    	}
    }

    int l = sc.nextInt();

    int[] d = new int[l];
    int[] e = new int[l];
    int[] f = new int[l];
    int[] g = new int[l];

	for(int k = 0; k < l; k++) {
	    d[k] = sc.nextInt();
	    e[k] = sc.nextInt();
	    f[k] = sc.nextInt();
	    g[k] = sc.nextInt();
	}

	int player = 1;

	int[] count = new int[c];

	for(int k = 0; k < c; k++) {
	    int firstCard = card[d[k] - 1][e[k] - 1];
	    int secondCard = card[f[k] - 1][g[k] - 1];

		if(firstCard == secondCard) {
	    	count[player - 1] += 2;
		} else {
			player += 1;

			if(player == c + 1) {
				player = 1;
			}
		}
	}

	for(int n = 0; n < c; n++) {
		System.out.println(count[n]);
	}
  }
}