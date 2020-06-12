package minami2;

public class Sample22 {

	public static void main(String[] args) {
		int intVal;
		double doubleVal;
		intVal = 10;
		doubleVal = 1.25;
		doubleVal = (double)(intVal * doubleVal);
		System.out.println("計算結果は"+doubleVal);

		long amount = 123_456_789L;
		System.out.println(amount);
	}

}
