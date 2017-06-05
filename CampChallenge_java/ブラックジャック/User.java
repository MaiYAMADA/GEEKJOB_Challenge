/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Black;

import java.util.*;

/**
 *
 * @author yamada
 */ 
public class User extends Human {

   //DealerとUser両方に必要な処理を実装
//SetCardはArrayListで受けたカード情報をmyCardに追加するように実装する。
//カードを自分の手札としてセット
    @Override
    public void setCard(ArrayList<Integer> set) {
         for (int l =0; l<set.size(); l++){
             myCards.add(set.get(l));
         }
    }
   
//「checkSum」というabstractな公開メソッド
//自分の今の合計値と21をチェックを行って、
//もっとカードを引かないとダメかもう十分か判断
    @Override
    public boolean checkSum() {
        return open() < 21;
    }
   
    
//OpenはmyCardsのカードの合計値を返却するように実装    
    @Override
    public Integer open() {
        int total = 0;
        for (int i = 0; i < myCards.size(); i++) {
            total = total + myCards.get(i);
        }
        return total;
    }

}
