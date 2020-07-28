package solveJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaiB12Shiritori_Answer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 人数n
		int n = sc.nextInt();
		// 単語リスト数k
		int k = sc.nextInt();
		// しりとりの回数m
		int m = sc.nextInt();

		// 単語リストを作成
		List<String> wordList = new ArrayList<>();
		for(int i = 0; i < k; i++) {
			wordList.add(sc.next());
		}

		// プレイヤーの配列
		List<Integer> players = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			players.add(i);
		}

		// 発言した単語のリスト
		List<String> words = new ArrayList<>();

		// しりとりを行う
		for(int shiriCount = 0; shiriCount < m; shiriCount++) {
			for(int playerNum = 0; playerNum < players.size() && shiriCount < m; playerNum++) {
				// 発言した単語をリストに入れる
				words.add(sc.next());

				// ルールに合ってなかったらプレイヤーと単語を削除
				isRule(words, shiriCount, players, playerNum, wordList);

				if(playerNum == players.size() - 1) {
					break;
				}

				// しりとりのカウントを増やす
				shiriCount++;
			}
		}

		// 残ったプレイヤー数を出力
		int playersCount = 0;
		for(int i = 0; i < players.size(); i++) {
			if(players.get(i) != null) {
				playersCount += 1;
			}
		}
		System.out.println(playersCount);

		// 残ったプレイヤーを出力
		for(int i = 0; i < players.size(); i++) {
			if(players.get(i) != null) {
				System.out.println(players.get(i) + 1);
			}
		}
		sc.close();
	}

	private static void isRule(List<String> words, int shiriCount, List<Integer> players, int playerNum, List<String> wordList) {
		// 単語リストに含まれているか？
		boolean isObeyRule = true;
		for(int i = 0; i < wordList.size(); i++) {
			if(words.get(shiriCount).equals(wordList.get(i))) {
				isObeyRule = true;
				break;
			}else {
				isObeyRule = false;
			}
		}

		// 一度使った単語を使ってないか？
		for(int i = 0; i < shiriCount; i++) {
			if(words.get(shiriCount).equals(words.get(i))) {
				isObeyRule = false;
				break;
			}
		}

		// 直前の人の発言の最後の文字と一緒か？
		if(shiriCount != 0 && words.get(shiriCount - 1) != null) {
			if(words.get(shiriCount - 1).substring(words.get(shiriCount - 1).length() - 1).equals(words.get(shiriCount).substring(1))) {
				isObeyRule = false;
			}
		}
		// 最後の文字がzで終わってないか？
		if(words.get(shiriCount).substring(words.get(shiriCount).length() - 1).equals("z")) {
			isObeyRule = false;
		}

		if(isObeyRule == false) {
			players.set(playerNum, null);
			words.set(shiriCount, null);
		}
	}

}
