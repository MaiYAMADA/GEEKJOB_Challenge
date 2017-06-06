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

//タイムスタンプの表示
//2016年11月4日 10時0分0秒のタイムスタンプを作成し、「年-月-日 時:分:秒」で表示してください。

public class challenge2_13 {
  public static void main(String[] args){
      //カレンダーインスタンスの作成
      Calendar c =Calendar.getInstance();
      
      //2016年11月4日
      c.set(2016,10,4,10,0,0);
      
      //表示
      System.out.print(c.get(Calendar.YEAR)+"年");
      System.out.print(c.get(Calendar.MONTH)+"月");
      System.out.print(c.get(Calendar.DAY_OF_MONTH)+"日");
      System.out.print(c.get(Calendar.HOUR_OF_DAY)+"時");
      System.out.print(c.get(Calendar.MINUTE)+"分");
      System.out.print(c.get(Calendar.SECOND)+"秒");
  }
    
}
