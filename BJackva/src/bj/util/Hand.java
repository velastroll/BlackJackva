package bj.util;

import java.util.ArrayList;
import bj.util.Card;


/**
 * BlackJack's hand implementation.
 * @author Velastroll - github.com/Velastroll
 */
public class Hand{

    ArrayList<Card> hand;

    /**
     * Implementing a BlackJack's Hand.
     */
    public Hand (){
        hand = new ArrayList<Card>();
    }

    /**
     * Method that add a new Card at our BlackJack's hand.
     * @param Card c is the new receibed card.
     */
    public void newCard(Card c){
        System.out.println(">> Otorgado: " + c.getCard());
        if (c!=null){
            hand.add(c);
        }
    }

    /**
     * Method that return the maximum value of our BlackJack's hand. If our hand has a ACE, this method adapts his value to get the maximum value accepted.
     * @return int value of our hand.
     */
    public int getValue(){
        int value=0;
        for (Card c: hand){
            value += c.getValue();
        }
        for (Card c: hand){
            if (value>=22 && c.getNumber()==1){
                value-=10;
            }
        }
        return value;
    }

    public ArrayList<Card> getHand(){
        return hand;
    } 
    
    public void reboot(){
        hand = new ArrayList<Card>();
    }
    
    private boolean hasACE(){
        for (Card c: hand){
            if (c.getNumber()==1) return true;
        }
        return false;
    }
}