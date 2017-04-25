package bj.util;

/**
 * Enum of poker cards numbers.
 * The card has a type (Type), and a number/figure.
 * @author Velastroll - github.com/Velastroll
 */
public class Card{

    int number;
    String type;

    public Card(){
        this.number = 22;
        this.type = "";
    }
    
    public Card (int number, String type){
        this.number = number;
        this.type = type;
    }
    
    public Card (int number, int type){
        this.number = number;
        if (type==0) this.type="p";
        if (type==1) this.type="d";
        if (type==2) this.type="c";
        if (type==3) this.type="t";
    }
    
    
    /**
     * Set a type. Its a enum - DIAMONDS, SPADES, HEARTS, CLUB.
     * @param type of Card.
     */
    public void setType(String type){
        this.type = type;
    }

    /**
     * Return a String with the card type.
     * @return String of card type.
     */

    public String getType(){
        return type;
    }

    
    public void setNumber(int number){
        this.number = number;
    }
    
    /**
     * Return a String with the card number/figure.
     * @return String of card number/figure.
     */
    public int getNumber(){
        return number;
    }

    /**
     * Return a String with the number/figure and type card.
     * @return String of card.
     */
    public String getCard(){
        return (this.type + "" + this.number);
    }

    /**
     * Return the card value.
     * @return int of card value.
     */
    public int getValue(){
        if (this.number==1) return 11;
        else if (this.number<10) return this.number;
        else return 10;
    }
}