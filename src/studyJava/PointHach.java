package studyJava;

public class PointHach {

	public static void main(String[] args) {
		Point point1 = new Point(3, 2);
		Point point2 = new Point(3, 2);

		System.out.println(point1); // Point@ 420
		System.out.println(point2); // Point@ 420
		System.out.println(point1.hashCode()); // 1056（ 0 x 420 の 10 進 数表現）
		System.out.println(point2.hashCode()); // 1056（ 0 x 420 の 10 進 数表 現）
		System.out.println(point1.equals(point2)); // true
	}

}
