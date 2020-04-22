package solveJava;

public class Gyakusuu {

	public static void main(String[] args) {

		float sum = 0;
		float count = 0;
		for(count = 1; count < 15000; count++) {
			sum += 1 / count;

			System.out.println(count);
			System.out.println(sum);
		}
	}

}
