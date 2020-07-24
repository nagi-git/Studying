package solveJava;

import java.util.ArrayList;
import java.util.Arrays;
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
		for(int i = 0; i < n; i++) {
			players.add(i);
		}

		// 現在の番のプレイヤー
		int playerNum = 0;

		// 発言した単語のリスト
		String[] shiriWord = new String[m - 1];

		// しりとりを行う
		for(int shiriNum = 0; shiriNum < m; shiriNum++) {

			// 発言した単語をリストに入れる
			shiriWord[shiriNum] = sc.next();

			// ルールに合ってなかったらプレイヤーを削除
			isRule(shiriWord, shiriNum, players, playerNum, wordList);

			// 次のプレイヤーに回す
			playerNum = playerNumJudge(players, playerNum);
		}

		// 残ったプレイヤーを出力
		for(int player : players) {
			System.out.println(player + 1);
		}


	}

	private static void isRule(String[] shiriWord, int shiriNum, List<Integer> players, int playerNum, String[] wordList) {
		// 単語リストに含まれているか？
		boolean isObeyRule = true;
		for(int i = 0; i < wordList.length; i++) {
			if(shiriWord[shiriNum].equals(wordList[i])) {
				isObeyRule = true;
				break;
			}else {
				isObeyRule = false;
			}
		}

		// 一度使った単語を使ってないか？
		for(int i = 0; i < shiriNum - 1; i++) {
			if(shiriWord[shiriNum] != shiriWord[i]) {
				isObeyRule = false;
			}
		}

		// 直前の人の発言の最後の文字と一緒か？
		if(shiriNum != 0) {
			if(shiriWord[shiriNum - 1].substring(shiriWord[shiriNum - 1].length() - 1) != shiriWord[shiriNum].substring(1)) {
				isObeyRule = false;
			}
		// 最後の文字がzで終わってないか？
		} else if("z" == shiriWord[shiriNum].substring(shiriWord[shiriNum].length() - 1)) {
			isObeyRule = false;
		}

		if(isObeyRule == false) {
			players.remove(playerNum);
			List<String> shiriWords = new ArrayList<>(Arrays.asList(shiriWord));
			shiriWords.remove(shiriNum);
			shiriWords.toArray(new String[0]);
		}
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
