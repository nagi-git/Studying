package solveJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class PaiC13UranaiAnswer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedHashMap<String, String> user2blood = new LinkedHashMap<String, String>();
		for (int i = 0; i < n; i++) {
			String user = sc.next();
			String blood = sc.next();
			user2blood.put(user, blood);
		}

		int m = sc.nextInt();
		HashMap<String, String> blood2result = new HashMap<String, String>();
		for (int i = 0; i < m; i++) {
			String blood = sc.next();
			String result = sc.next();
			blood2result.put(blood, result);
		}

		for (String user : user2blood.keySet()) {
			String blood = user2blood.get(user);
			String result = blood2result.get(blood);
			System.out.println(user + " " + result);
		}
	}
}
