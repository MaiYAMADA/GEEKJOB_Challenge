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

//標準クラスファイル操作編課題：ファイルから読み出しと表示
//ファイルから自己紹介を読み出し、表示してください。


public class challenge2_19 {
   public static void main(String[] args){

        
        File A = new File("C:\\Users\\yamada\\Desktop\\sample.txt"); 
        

       try{
      
       //FileReader作成
       
       // File A=new File("box/text1.txt");
       FileReader C = new FileReader(A);
        
       //BufferedReader作成
       BufferedReader D =new BufferedReader(C);
       
       //1行読み出し
       System.out.print(D.readLine());
       
       D.close();
       } catch ( IOException e) {
           
   }
   
       
       
   }   
     
}
