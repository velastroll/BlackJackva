package util;

/**
 * Enum of poker cards numbers.
 * The card has a type (Type), and a number/figure.
 * @author Velastroll - github.com/Velastroll
 */
public enum Card{
    TWO(), THREE(), FOUR(), FIVE(),
    SIX(), SEVEN(), EIGHT(), NINE(),
    TEN(), JACK(), QUEEN(), KING(), ACE();

    Type type = null;

    /**
     * Set a type. Its a enum - DIAMONDS, SPADES, HEARTS, CLUB.
     * @param type of Card.
     */
    public void setType(Type ty){
        this.type = ty;
    }

    /**
     * Return a String with the card type.
     * @return String of card type.
     */

    public String getTypeStr(){
        return type.getTypeString();
    }

    /**
     * Return a String with the card number/figure.
     * @return String of card number/figure.
     */
    public String getNumberStr(){
        switch(this){
            case ACE:   return "ACE";
            case TWO:   return "Two";
            case THREE: return "Three";
            case FOUR:  return "Four";
            case FIVE:  return "Five";
            case SIX:   return "Six";
            case SEVEN: return "Seven";
            case EIGHT: return "Eight";
            case NINE:  return "Nine";
            case TEN:   return "Ten";
            case JACK:  return "Jack";
            case QUEEN: return "Queen";
            case KING:  return "King";
        }
        return "";
    }

    /**
     * Return a String with the number/figure and type card.
     * @return String of card.
     */
    public String getCard(){
        return (this.getNumberStr() + " of " + getTypeStr() + ".");
    }

    /**
     * Return the card value.
     * @return int of card value.
     */
    public int getValue(){
        switch(this){
            case ACE:   return 11;
            case TWO:   return 2;
            case THREE: return 3;
            case FOUR:  return 4;
            case FIVE:  return 5;
            case SIX:   return 6;
            case SEVEN: return 7;
            case EIGHT: return 8;
            case NINE:  return 9;
            case TEN:   return 10;
            case JACK:  return 10;
            case QUEEN: return 10;
            case KING:  return 10;
        }
        return 100;
    }
}