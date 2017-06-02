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

//課題:クラスの継承
//「クラスの作成」で作成したクラスを継承し、以下の機能を持つクラスを作成してください。
//1. ２つの変数の中身をクリアするパブリックなメソッド

//Humanクラスを継承して、Teacherクラスを宣言
class challenge2_10 extends Human{
    public void num(){
    name=null;
    age=0;
    }
    
    public static void main(String[] args){
    challenge2_10 ruru =new challenge2_10();
    
    ruru.name="山田";
    ruru.num();
    System.out.println(ruru.name);
    
    }
}

    
    

