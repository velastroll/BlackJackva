package util;

import java.util.ArrayList;
import util.CardException;
import util.Card;

public class Deck {

    ArrayList<Card> deck;
    int i;

    public Deck(){
        deck = new ArrayList<Card>();
    }

    public static void main (String [] args){
        Deck baraja = new Deck();
        baraja.fillin();
    }

    private void fillin(){
        for(i=1; i<53;){
            int number = (int) (Math.floor(Math.random()*13)+1);
            Card card = generateCard(number);
            System.out.print("Carta: "+card+" of "+card.getTypeStr()+".\n");
            deck.add(card);
            i++;
        }
        System.out.println("\n>>>> Baraja Rellenada!\n"+deck);
    }

    private Card generateCard(int number){
        Card card = null;
        //System.out.print(number);
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
        if (card == null) System.out.println("MACHO QUE LA CARTA ES NULA JOE\n");
        return card;
    }


    public void generateType(Card card){
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
}