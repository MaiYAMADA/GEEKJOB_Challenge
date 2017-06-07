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

//標準クラス文字列課題：文字の入れ替え
//以下の文章の「I」⇒「い」に、「U」⇒「う」に入れ替える処理を作成し、結果を表示してください。
//「きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます」
public class challenge2_17 {
  public static void main (String[] args){
     
      
String word = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
//「I」⇒「い」に
String irekae1 = word.replace("I", "い");

//「I」⇒「い」に
String irekae2 = irekae1.replace("U", "う");

System.out.print(irekae2);

    
  }
    
    
}
