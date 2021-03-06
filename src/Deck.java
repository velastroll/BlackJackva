package util;

import java.util.ArrayList;
/** 
 * Implementation of a poker cards Deck - (Baraja).
 * @author Velastroll - github.com/Velastroll
 */
public class Deck {

    ArrayList<Card> deck;
    int i;

    /**
     * Implementing a new Deck of cluttered poker Cards.
     */
    public Deck(){
        deck = new ArrayList<Card>();
        fillin();
    }

    /**
     * Method that distributed one Card.
     * @return Card that has been distributed.
     */
    public Card getCard(){
        Card c = deck.remove(0);
        System.out.print(c.getCard());
        return c;
    }

    /**
     * Method that generate and clutter the cards.
     */
    public void fillin(){
        for(i=1; i<53;){
            int number = (int) (Math.floor(Math.random()*13)+1);
            Card card = generateCard(number);
            deck.add(card);
            i++;
        }
    }

    private Card generateCard(int number){
        Card card = null;
        switch (number){
            case 1:     card = Card.ACE;    break;
            case 2:     card = Card.TWO;    break;
            case 3:     card = Card.THREE;  break;
            case 4:     card = Card.FOUR;   break;
            case 5:     card = Card.FIVE;   break;
            case 6:     card = Card.SIX;    break;
            case 7:     card = Card.SEVEN;  break;
            case 8:     card = Card.EIGHT;  break;
            case 9:     card = Card.NINE;   break;
            case 10:    card = Card.TEN;    break;
            case 11:    card = Card.JACK;   break;
            case 12:    card = Card.QUEEN;  break;
            case 13:    card = Card.KING;   break;
        }
        generateType(card);
        return card;
    }

    private void generateType(Card card){
        int index=deck.lastIndexOf(card);
        if (index==-1) card.setType(Type.CLUB);
        else {
            String lastType = (deck.get(index)).getTypeStr();
            switch (lastType){
                case "Club":      card.setType(Type.DIAMONDS);  break;
                case "Diamonds":  card.setType(Type.HEARTS);    break;
                case "Hearts":    card.setType(Type.SPADES);    break;
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