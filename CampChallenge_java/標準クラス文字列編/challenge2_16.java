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

//標準クラス文字列課題：文字数の取得
//自分のメールアドレスの「＠」以降の文字を取得して、表示してください。

public class challenge2_16 {
 public static void main(String[] args) {
        String word = "ishida7575@gmail.com";

        // 5番目以降を取得 -- "@gmail.com"
        System.out.print(word.substring(10));

        
    }
     
   
  }   
