/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.java;

import java.util.Calendar;


/**
 *
 * @author yamada
 */

//タイムスタンプの作成
//2016年1月1日 0時0分0秒のタイムスタンプを作成し、表示してください。
public class challenge2_11 {
    
    public static void main(String[] args){
//カレンダーインスタンスの作成
Calendar c = Calendar.getInstance();

//2016年1月1日 0時0分0秒
c.set(2016,0,1,0,0,0);

//表示
System.out.print(c.getTime());
         
    }
    
}
