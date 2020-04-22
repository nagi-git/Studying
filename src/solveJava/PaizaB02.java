package solveJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaizaB02 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int M = sc.nextInt();

		// 単語リスト
		String[] wordList = new String[K];
		for(int i = 0; i < K; i++) {
			wordList[i] = sc.next();
		}

		// プレイヤーリスト
		List<Integer> players = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			players.add(i + 1);
		}

		int countUpM = 0;
		String[] shiritoriWord = new String[M];
		while(countUpM < M) {
			for(int playerCount = 0; playerCount < N; playerCount++) {
				shiritoriWord[countUpM] = sc.next();
				int sameWordCount = 0;
				for(String word : wordList) {
					//
					if(word.equals(shiritoriWord[countUpM])) {
						sameWordCount ++;
					}
				}
				// 単語リストに同じ文字列がない、またはダブってる場合
				if(sameWordCount == 0 && sameWordCount > 1) {
					// アウトにする
					players.remove(playerCount);
					N--;
				} else if(countUpM > 1) {
					// 前の人の最後の文字と今回の人の最初の文字が一致しているか確認
					if(shiritoriWord[countUpM - 1].length() > 1) {
						// 前の人の最後の文字と今回の人の最初の文字が一致していない場合、
						if(!shiritoriWord[countUpM - 1].endsWith(shiritoriWord[countUpM].substring(0, 1))) {
							// アウトにする
							players.remove(playerCount);
							N--;
						}
					}
//						else if (shiritoriWord[countUpM - 1].charAt(1)
//							!= shiritoriWord[countUpM].charAt(1)) {
//						players.remove(playerCount);
//						N--;
//					}
				} else if(shiritoriWord[countUpM].charAt(shiritoriWord[countUpM].length() - 1) == 'z') {
					players.remove(playerCount);
					N--;
				}
				countUpM++;
			}
		}

		System.out.println(players.size());
		for(int player : players) {
			System.out.println(player);
		}
	}
//	private static boolean outProcess(int playerCount) {
//		players.remove(playerCount);
//		N--;
//	}
}
