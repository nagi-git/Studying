package solveJava;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int d = sc.nextInt();

	    int[] num = {a, b, c, d};

	    int sameCount = 0;
	    for(int i = 0; i < 4; i++) {
	    	for(int j = i + 1; j < 4; j++) {
		    	if(num[i] == num[j]) {
		    		sameCount++;
		    	}
	    	}

	    }
	    if(sameCount >= 2 && sameCount <= 3) {
	    	System.out.println("YES");
	    } else {
	    	System.out.println("NO");
	    }
		sc.close();
	}
}
