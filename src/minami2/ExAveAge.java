package minami2;

/**
 * @version 2007.06
 * @author Mitsuomi Shimada
 * Copyright 2007 Tempstaff Technologies Co.,Ltd．all right reserve.
 */

public class ExAveAge{
    /**
     * 起動メソッド。
     */
    public static void main(String[] args){

        int n = args.length;
        //入力チェック
        if(n==0){
            System.out.println("引数に年齢を指定してください");
            System.out.println(
                "AvgAge ［年齢］［年齢］［年齢］［年齢］．．．");
            return;
        }

        //年齢合計値計算
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Integer.parseInt(args[i]);
        }
        //年齢平均値計算
        int avg = sum / n;
        //表示
        System.out.println("平均年齢=" + avg);
    }
}