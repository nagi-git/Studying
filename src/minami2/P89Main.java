package minami2;

public class P89Main {

	public static void main(String[] args) {
		int i;

		if(args.length == 0) {
			System.out.println("コマンドライン引数がありません。");
		} else {
			for(i = 0; i < args.length; i++) {
				System.out.println((i+1) + "：" + args[i]);
			}
		}
	}

}
