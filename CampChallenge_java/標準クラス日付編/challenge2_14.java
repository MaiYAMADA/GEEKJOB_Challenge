/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author yamada
 */

//タイムスタンプの表示
//2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）を表示してください。

public class challenge2_14 {
   public static void main(String[] args) {
      
     //Dateをインスタンス化  
      Date A=new Date();
      Date B=new Date();
     
      //SimpleDateFormatをインスタンス化
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
       
     //Date型を文字列に変換＆日時を指定
     try {
     A = sdf.parse("2015-01-01 0:0:0");
     B = sdf.parse("2015-12-31 23:59:59");
           
   } catch (ParseException e) {
    
    }
     
     //タイムスタンプを取得し、Date型のオブジェクトを整数へ代入
     long A1 = A.getTime();  
     long B1 = B.getTime();
     
     System.out.println("2015年1月1日0時0分0秒のタイムスタンプ:"+A1);
     System.out.println("2015年12月31日23時59分59秒のタイムスタンプ:"+B1);
     
     //A1、A2のうち大きい数値を取得
     long large=Math.max(A1, B1); 
     
     //A1、A2のうち大きい数値を取得
     long small=Math.min(A1, B1);
     
     long x=large-small;
     
     System.out.print(x);
      
      
     
     
       
      
      
   }
}
