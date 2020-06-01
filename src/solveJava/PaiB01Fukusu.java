package solveJava;

import java.util.Scanner;

public class PaiB01Fukusu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String[] word = new String[N];
		for(int i = 0; i < N; i++) {
			word[i] = sc.next();

			if(word[i].substring(word[i].length() - 2).equals("sh")
				|| word[i].substring(word[i].length() - 2).equals("ch")
				|| word[i].substring(word[i].length() - 1).equals("s")
				|| word[i].substring(word[i].length() - 1).equals("o")
				|| word[i].substring(word[i].length() - 1).equals("x")) {
				word[i] = word[i] + "es";
			}

			if(word[i].substring(word[i].length() - 2).equals("fe")) {
				word[i] = word[i].replaceAll("fe$", "ves");
			}

			if(word[i].substring(word[i].length() - 1).equals("f")) {
				word[i] = word[i].replaceAll("f$", "ves");
			}

			if(word[i].substring(word[i].length() - 1).equals("y")) {
				if(!word[i].substring(word[i].length() - 2).equals("ay")
					&& !word[i].substring(word[i].length() - 2).equals("iy")
					&& !word[i].substring(word[i].length() - 2).equals("uy")
					&& !word[i].substring(word[i].length() - 2).equals("ey")
					&& !word[i].substring(word[i].length() - 2).equals("oy")) {
					word[i] = word[i].replaceAll("y$", "ies");
				}
			}

			if(! word[i].substring(word[i].length() - 1).equals("s")) {
				word[i] = word[i] + "s";
			}
		}


		for(int k = 0; k < N; k++) {
			System.out.println(word[k]);
		}
	}

}
