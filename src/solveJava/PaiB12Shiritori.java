package solveJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaiB12Shiritori {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 人数n
		int n = sc.nextInt();
		// 単語リスト数k
		int k = sc.nextInt();
		// しりとりの回数m
		int m = sc.nextInt();

		// 単語リストを作成
		String[] wordList = createWordList(k, sc);

		// プレイヤーの配列
		List<Integer> players = new ArrayList<>();
		for(int player : players) {
			players.add(player);
		}

		// 現在の番のプレイヤー
		int playerNum = 0;

		// しりとりを行う
		for(int i = 0; i < m; i++) {

			playerNum = playerNumJudge(players, playerNum);

			String shiriWord = sc.next();

			isRule(shiriWord, players, playerNum);
		}

		// 残ったプレイヤーを出力



	}

	private static void isRule(String shiriWord, List<Integer> players, int playerNum) {
		isRule
	}

	private static int playerNumJudge(List<Integer> players, int playerNum) {
		if(playerNum == players.size()) {
			playerNum = 0;
		}else {
			playerNum += 1;
		}
		return playerNum;
	}

	private static String[] createWordList(int k, Scanner sc) {
		String[] wordList = new String[k];
		for(int i = 0; i < k; i++) {
			wordList [i] = sc.next();
		}
		return wordList;
	}

}
