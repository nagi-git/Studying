
package solveJava;

import java.util.Scanner;

public class Test01_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// a
		int a = sc.nextInt();
		// b
		int b = sc.nextInt();

		for(int i = a; i <= b; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print("FizzBuzz");
			}else if(i % 3 == 0) {
				System.out.print("Fizz");
			}else if(i % 5 == 0){
				System.out.print("Buzz");
			}else {
				System.out.print(i);
			}
			if(i < b) {
				System.out.print(", ");
			}
		}

		sc.close();

	}

}
