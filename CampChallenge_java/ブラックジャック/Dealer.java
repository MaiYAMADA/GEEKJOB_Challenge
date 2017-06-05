/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Black;

/**
 *
 * @author yamada
 */
import java.util.*;

//Dealerクラス
public class Dealer extends Human {

//cardというArrayListの変数を用意し初期段階で
//このcardsに全てのトランプを持たせる。
//（1～10＋10が3つ）×4
    public ArrayList<Integer> cards = new ArrayList<Integer>();

    public Dealer() {
        for (Integer num = 1; num <= 4; num++) {
            cards.add(1);
            cards.add(2);
            cards.add(3);
            cards.add(4);
            cards.add(5);
            cards.add(6);
            cards.add(7);
            cards.add(8);
            cards.add(9);
            cards.add(10);
            cards.add(10);
            cards.add(10);
            cards.add(10);
        }
    }

//dealという公開メソッドを用意し、cardsからランダムで2枚のカードを
//ArrayListにして返却する。
    public ArrayList<Integer> deal() {

        Random rand = new Random();

        Integer card1 = rand.nextInt(cards.size());
        Integer card2 = rand.nextInt(cards.size());

        Integer card11 = cards.get(card1);
        Integer card22 = cards.get(card2);

        cards.remove(card1);
        cards.remove(card2);

        ArrayList<Integer> de = new ArrayList<Integer>();
        de.add(card11);
        de.add(card22);

        return de;
    }

//hitという公開メソッドを用意し、cardsからランダムで1枚のカードを
//ArrayListにして返却する。
    public ArrayList<Integer> hit() {

        Random rand = new Random();

        Integer card3 = rand.nextInt(cards.size());
        Integer card33 = cards.get(card3);
        cards.remove(card3);

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(card33);

        return al;
    }

//DealerとUser両方に必要な処理を実装
//SetCardはArrayListで受けたカード情報をmyCardに追加するように実装する。
//カードを自分の手札としてセット
    @Override
    public void setCard(ArrayList<Integer> set) {

        for (int l = 0; l < set.size(); l++) {
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
