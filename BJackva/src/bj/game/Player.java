package bj.game;

import bj.util.CardException;
import bj.util.Card;
import bj.util.Hand;
import java.lang.IllegalArgumentException;

public class Player{

    private int bank;
    private boolean state;
    private Hand h;
    
    public Player(){
        h = new Hand();
        state = true;
        bank=0;
    }

    public void addCard(Card c){
        if (c==null) System.out.print("La carta es nula.");
        else{
            h.newCard(c);
            if (h.getValue()>=22) state=false;
        }
    }
    
    public Hand getHand(){
        return h;
    }

    public int getPoints(){
        return h.getValue();
    }

    public void setMoney(double money){
        bank += money;
    }
    
    public void rebootHand(){
        h = new Hand();
    }

    public void bet(double chip){
        if (chip>bank) System.out.println("NO TIENES SUFICIENTE DINERO!");
        else bank-=chip;
    }

}