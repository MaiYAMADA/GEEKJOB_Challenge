/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author yamada
 */
//標準クラスを利用して処理を作成
//紹介していないJAVAの標準クラスを利用して、処理を作成してください。
//講義では紹介されていないJAVAの標準クラスはたくさん存在します。
//１つJAVAの標準クラスを選び、実際にロジックを作成してみてください。
//また、この処理を作成するに当たり、下記を必ず実装してください。
//1. 処理の経過を書き込むログファイルを作成する。
//2. 処理の開始、終了のタイミングで、ログファイルに開始・終了の書き込みを行う。
//3. 書き込む内容は、「日時　状況（開始・終了）」の形式で書き込む。
//4. 最後に、ログファイルを読み込み、その内容を表示してください。
//Mathクラス--sqrtメソッド、qbrtメソッド
public class challenge2_20 {

//ログファイル作成のための準備
//現在の日付を取得する（のちにログファイル名に使用する）   
    public static void main(String args[]) {

        //今日の日付作成
        Date now = new Date();
        //SimpleDateFormat作成
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        File fp = new File("C:\\Users\\yamada\\Desktop\\sample2.txt");

        try {

            //FileWriter作成
            FileWriter fw = new FileWriter(fp);

            //FileReader作成
            FileReader fr = new FileReader(fp);

            //BufferedReader作成
            BufferedReader br = new BufferedReader(fr);

            //開始
            fw.write(sdf.format(now) + "開始します");

            double a = 9d;
            double b = 100d;

            fw.write("「" + a + " 」の平方根は");
            fw.write("「" + Math.sqrt(a) + "」です。");

            fw.write("「" + b + "」の立方根は");
            fw.write("「" + Math.cbrt(b) + "」です。");

            Date no = new Date();
            //SimpleDateFormat作成
            SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

            //終了
            fw.write(sd.format(no) + "終了します");

            fw.close();

            //読み込み
            System.out.print(br.readLine());

            //全部読み込む場合↓
            // String str;
            //while((str = br.readLine()) != null){
            // System.out.println(str);
            // }
            
        } catch (IOException e) {

        }
    }
}
