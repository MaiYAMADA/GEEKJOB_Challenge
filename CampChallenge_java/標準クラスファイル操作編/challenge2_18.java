/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.java;

import java.io.*;

/**
 *
 * @author yamada
 */

//標準クラスファイル操作編課題：ファイルの書き出しと保存
//ファイルに自己紹介を書き出し、保存してください。
   
public class challenge2_18 {
    public static void main(String[] args){
      //ファイルオープン
        File A = new File("C:\\Users\\yamada\\Desktop\\sample.txt"); try{
        //FileWriter作成
        FileWriter B = new FileWriter(A);
        //自己紹介書き込み
        B.write("私の名前は山田麻以です。静岡県出身です。");
        //クローズ
        B.close();
        
        
       
        } catch ( IOException e){
            
        }
        
    }
    
}
