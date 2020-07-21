package ryo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PaiC13Uranai {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ユーザーMap
		Map<String, String> userMap = readData(new LinkedHashMap<>(), sc);
		// 占い結果Map
		Map<String, String> uranaiMap = readData(new HashMap<>(), sc);

		for(String key : userMap.keySet()) {
			System.out.println(key + " " + uranaiMap.get(userMap.get(key)));
		}
	}

	private static Map<String, String> readData(Map<String, String> map, Scanner sc) {
		int count = sc.nextInt();
		for(int i = 0; i < count; i++) {
			map.put(sc.next(), sc.next());
		}
		return map;
	}
}
