package util;

import java.util.ArrayList;
import util.Card;


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
            if (value>=22 && c==Card.ACE){
                value-=10;
            }
        }
        return value;
    }

    private boolean hasACE(){
        for (Card c: hand){
            if (c==Card.ACE) return true;
        }
        return false;
    }
}