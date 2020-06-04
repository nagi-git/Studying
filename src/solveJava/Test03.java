package solveJava;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String nStr = Integer.toString(n);

	    String[] nArray = new String[String.valueOf(n).length()];
	    int[] nArrayNum = new int[String.valueOf(n).length()];
	    int nArrayNumSum = 0;
	    int nZeroCount = 0;
	    for(int i = 0; i < n; i++) {
	    	if(n <= 0) {
	    		break;
	    	}

		    nArray = new String[String.valueOf(n).length()];
		    nArrayNum = new int[String.valueOf(n).length()];
		    for(int j = 0; j < nArray.length; j++) {
		    	nArray[j] = nStr.substring(j, j + 1);
		    	nArrayNum[j] = Integer.parseInt(nArray[j]);
		    }
		    for(int k = 0; k < nArrayNum.length; k++) {
		    	nArrayNumSum += nArrayNum[k];
		    }

		    n -= nArrayNumSum;
		    nStr = Integer.toString(n);
		    nZeroCount = i;
	    }
	    System.out.println(nZeroCount);
		sc.close();
	}
}
