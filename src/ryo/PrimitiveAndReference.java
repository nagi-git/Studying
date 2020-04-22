package ryo;

import java.util.ArrayList;
import java.util.List;

/**
 * 参照型とプリミティブ型のメソッドが
 * 異なる動作をする確認プログラム
 *
 * @author Ryo
 */
public class PrimitiveAndReference {

	public static void main(String[] args) {

		int primitive = 1;
		int resultPrim = countUpPrimitive(primitive);
		System.out.println("primitive: " + primitive);
		System.out.println("result:    " + resultPrim);

		System.out.println();

		Instance instance = new Instance(1);
		Instance resultIns = countUpClass(instance);
		System.out.println("instance: " + instance.value);
		System.out.println("result:   " + resultIns.value);

		System.out.println();

		List<Integer> list = new ArrayList<>();
		list.add(new Integer(1));
		List<Integer> resultList = countUpClass(list);
		System.out.println("instance: " + resultList);
		System.out.println("result:   " + resultList);

	}

	private static int countUpPrimitive(int primitive) {
		// mainメソッドで渡したprimitiveのコピーを受け取り、インクリメントする
		System.out.println("primitive: " + primitive);
		primitive++;
		System.out.println("primitive: " + primitive);
		return primitive;
	}

	private static Instance countUpClass(Instance instance) {
		// mainメソッドで渡したinstance（＝参照先のアドレス）のコピー
		// （つまり同じ参照先）を受け取り、インクリメントする
		System.out.println("instance: " + instance.value);
		instance.add(1);
		System.out.println("instance: " + instance.value);
		return instance;
	}

	private static List<Integer> countUpClass(List<Integer> list) {
		// listから出したIntegerを受けとる変数（instance）に別のインスタンスを代入。
		// listを変更する処理はない。
		System.out.println("instance: " + list);
		Integer instance = list.get(0);
		instance = new Integer(2);
		System.out.println("instance: " + list);
		return list;
	}

	private static class Instance {

		int value;

		Instance(int value) {
			this.value = value;
		}

		void add(int value) {
			this.value += value;
		}
	}

}
