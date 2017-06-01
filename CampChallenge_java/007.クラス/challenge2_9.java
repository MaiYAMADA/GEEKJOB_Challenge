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

//課題：クラスの作成
//以下の機能を持つクラスを作成してください。
//1. パブリックな２つの変数と、２つの変数に値を設定するパブリックなメソッドと、
//２つの変数の中身をprintするパブリックなメソッド

class Human {
//フィールドの宣言
public String name ="";
public int age =0;

//メソッドの宣言
public void setHuman(String n,int a){
//引数をフィールドへ設定
this.name=n;
this.age=a;

}

//メソッドの宣言
public void printHuman(){
 System.out.println(name);
 System.out.println(age);
}

}



public class challenge2_9 {
    public static void main(String[] args){
     //Humanクラスのインスタンス生成
     Human hito=new Human();
     
     //人インスタンスのageフィールドへ年齢設定
     hito.age=40;
     
     //確認
     System.out.println(hito.age);
     
     
     //人インスタンスのsetHumanメソッドを利用
     hito.setHuman("添田亮司", 34);
    
     //人インスタンスのprintHumanメソッドを利用
    hito.printHuman();
 }
}
