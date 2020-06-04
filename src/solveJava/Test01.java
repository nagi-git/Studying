package solveJava;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();

	    int totalMoney = a;
	    int juceCount = 0;
	    for(int i = 1; i <= c; i++) {
	    	totalMoney = b * i;
	    	juceCount = i;
	    	if(totalMoney > a) {
	    		break;
	    	}
	    }
	    System.out.println(juceCount);
		sc.close();
	}
}
