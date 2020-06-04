package ryo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaizaB02 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int[] nkm = scanInput(sc);
		int n = nkm[0];
		int k = nkm[1];
		int m = nkm[2];

		// 単語リストを取得
		List<String> wordList = getWordList(sc, k);


		int countUpM = 0;
		String prevWord = "";
		List<String> usedWordList = new ArrayList<>();
//		while (!isEnd(m, countUpM)) {
			// この回の人が言った語を取得
			String word = scanWork(sc, usedWordList);

			if (!isNotFollowingRule(prevWord, word, wordList, usedWordList)) {
//				// しりとりから外す
//				letOut();

				// 今回の人の語を初期化する
				prevWord = "";

				usedWordList.add(word);
//				continue;
			}

			usedWordList.add(word);
			sc.close();

	}

	private static String scanWork(Scanner sc, List<String> usedWordList) {
		String word = sc.next();
//		usedWordList.add(word);
		return word;
	}

	private static int[] scanInput(Scanner sc) {
		int[] nkm = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		return nkm;
	}


	private static List<String> getWordList(Scanner sc, int k) {
		List<String> wordList = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			wordList.add(sc.next());
		}
		return wordList;
	}


	private static boolean isNotFollowingRule(String prevWord, String word,
			List<String> wordList, List<String> usedWordList) {
		if (word.endsWith("z")) {
			// Zで終わっていたらNG
			return false;
		}

		if (!wordList.contains(word)) {
			// 単語リストになかったらNG
			return false;
		}

		if (usedWordList.contains(word)) {
			// 既出の単語リストにあったらNG
			return false;
		}

		if (!prevWord.isEmpty()) {
			// 前の人の語が空文字の場合、今回の人は先頭の人と見なし、追加でチェックを行う
			if (!prevWord.endsWith(word.substring(0, 1))) {
				// 前回の人の語の末尾と、今回の人の頭文字が一致しなければNG
				return false;
			}
		}

		return true;
	}
}
