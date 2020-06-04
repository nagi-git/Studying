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
			for(int playerCount = 0; playerCount < N && countUpM < M; playerCount++) {
				shiritoriWord[countUpM] = sc.next();
				int sameWordCount = 0;
				for(String word : wordList) {
					//
					if(word.equals(shiritoriWord[countUpM])) {
						sameWordCount ++;
					}
				}
				// 単語リストに同じ文字列がない場合
				if(sameWordCount == 0) {
					// アウトにする
					players.remove(playerCount);
					N--;
				} else if(countUpM > 1) {
					// 前の人の最後の文字と今回の人の最初の文字が一致していない場合、
					if(!shiritoriWord[countUpM - 1].endsWith(shiritoriWord[countUpM].substring(0, 1))) {
						// 前の人がアウトになっていなかったら
						if(sameWordCount == 0) {
							continue;
						} else if(!shiritoriWord[countUpM - 2].endsWith(shiritoriWord[countUpM - 1].substring(0, 1))) {
							continue;
						} else if(shiritoriWord[countUpM - 1].endsWith("z")) {
							continue;
						}
					} else if(shiritoriWord[countUpM].endsWith("z")) {
						players.remove(playerCount);
						N--;
					}
				}countUpM++;
			}
		}
		sc.close();

		System.out.println(players.size());
		for(int player : players) {
			System.out.println(player);
		}
	}

	private static class OutProcess {
		static List<Integer> players;
		static int N;

		OutProcess(List<Integer> players, int N) {
			this.players = players;
			this.N = N;
		}

		static List<Integer> outProcess1(int playerCount) {
			players.remove(playerCount);
			return players;
		}

		static int outProcess2(int N) {
			return N--;
		}
	}

}
