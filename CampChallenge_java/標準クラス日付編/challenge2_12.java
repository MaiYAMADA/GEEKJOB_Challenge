/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.java;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author yamada
 */
//課題：現在の日時の表示
//現在の日時を「年-月-日 時:分:秒」で表示してください。
public class challenge2_12 {

    public static void main(String[] args) {
       
    SimpleDateFormat d2 =new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
   Date d = new Date();
    String q2 = d2.format(d);
    System.out.println(q2);
    
    
        
    }

}
