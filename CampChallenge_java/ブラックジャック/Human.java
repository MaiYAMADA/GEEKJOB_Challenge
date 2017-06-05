/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Black;

import java.util.ArrayList;

/**
 *
 * @author yamada
 */

//1.「Human」という抽象クラスを作成し、以下を実装
abstract class Human{
    
//1-1「open」というabstractな公開メソッド
//カードの合計値を計算してその値を返す
abstract public Integer open();
    
//1-2「setCard」というArrayListを引数としたabstractな公開メソッド
//カードを自分の手札としてセットする際に使う
//ユーザーとディーラーそれぞれにセットカードを用意
abstract public void setCard(ArrayList<Integer> set);

//1-3　「checkSum」というabstractな公開メソッド
//自分の今の合計値と21をチェックを行って、
//もっとカードを引かないとダメかもう十分か判断
abstract public boolean checkSum();

//1-4　「myCards」というArrayListの変数
//自分の手札を管理するイメージ
//ユーザーはユーザーの「myCards」
//ディーラーはディーラーの「myCards」にカードを保管する。
public ArrayList<Integer> myCards =new ArrayList<Integer>();    
       
}





