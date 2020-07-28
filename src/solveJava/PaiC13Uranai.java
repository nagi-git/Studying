package solveJava;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class PaiC13Uranai {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		// ユーザーMap
		LinkedHashMap<String, String> userMap = new LinkedHashMap<>();

		for(int i = 0; i < n; i++) {
			userMap.put(sc.next(), sc.next());
		}

		int m = sc.nextInt();
		// 占い結果Map
		LinkedHashMap<String, String> uranaiMap = new LinkedHashMap<>();

		for(int i = 0; i < m; i++) {
			uranaiMap.put(sc.next(), sc.next());
		}

		for(String key : userMap.keySet()) {
			System.out.println(key + " " + uranaiMap.get(userMap.get(key)));
		}
		sc.close();
	}
}
