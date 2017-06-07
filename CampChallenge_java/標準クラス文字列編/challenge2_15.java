/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.java;

/**
 *
 * @author yamada
 */

//標準クラス課題：文字列編：バイト数と文字数の取得
//自分の氏名について、バイト数と文字数を取得して、表示してください。
public class challenge2_15 {
    public static void main(String[] args){
      String word ="山田麻以";
      //文字数の表示
      System.out.println(word.length()+"文字");
      
      //バイト数を表示
      System.out.println(word.getBytes().length+"バイト");
    }
        
}
