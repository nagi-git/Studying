package solveJava;

public class Toribo {

	public static void main(String[] args) {
		int[] NumSum = new int[32];
		NumSum [0] = 1;
		NumSum [1] = 0;
		NumSum [2] = 5;

		for(int i = 0; i <= 35; i++) {
			NumSum[i + 3] = NumSum[i] + NumSum[i + 1] + NumSum[i + 2];
			System.out.println(NumSum[i + 3]);
		}

	}

}
