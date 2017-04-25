package bj.util;

import bj.util.Card;
import java.util.ArrayList;
/** 
 * Implementation of a poker cards Deck - (Baraja).
 * @author Velastroll - github.com/Velastroll
 */
public class Deck {

    ArrayList<Card> deck;
    int[] number;
    int i;

    /**
     * Implementing a new Deck of cluttered poker Cards.
     */
    public Deck(){
        deck = new ArrayList<Card>();
        fillin();
        for (Card c: deck) System.out.println("Viendo: "+c.getCard());
    }

    /**
     * Method that distributed one Card.
     * @return Card that has been distributed.
     */
    public Card getCard(){
        Card c = deck.get(0);
        deck.remove(0);
        System.out.println("Sacado de la baraja: " + c.getCard());
        return c;
    }

    /**
     * Method that generate and clutter the cards.
     */
    public void fillin(){
        int[] cards = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        for(i=1; i<53;){
            int nc;
            nc = (int) (Math.floor(Math.random()*13)+1);
            int numbercard = cards[nc];
            if (numbercard<4){
                deck.add(new Card(nc, numbercard));
                System.out.println(deck.size() + ") Metido: " + nc);
                //System.out.println(deck.size() + ") Primera: " + deck.get(0).getCard() + "\t Segunda: "+ deck.get(deck.size()-1).getCard());
                i++;
                cards[nc]+=1;
            }
        }
    }
    
    /**
     * Method that returns the size of the deck available.
     * @return int deck size.
     */
    public int getSize(){
        return deck.size();
    }    
}