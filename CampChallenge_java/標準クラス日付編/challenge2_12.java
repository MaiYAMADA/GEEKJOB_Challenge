/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.java;

import java.util.Date;

/**
 *
 * @author yamada
 */
//課題：現在の日時の表示
//現在の日時を「年-月-日 時:分:秒」で表示してください。
public class challenge2_12 {

    public static void main(String[] args) {
        //現在の日時で日付情報を作成
        Date d = new Date();

        System.out.print(d);

    }

}
