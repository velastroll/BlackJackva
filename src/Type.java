package util;
/**
 * Enum of card type. It would be Spades, Diamonds, HEarts, or Club.
 * @author Velastroll - github.com/Velastroll
 */
public enum Type{

    SPADES(), DIAMONDS(), HEARTS(), CLUB();

    /**
     * Return a String of the type of card.
     */
    public String getTypeString(){
        //Class c = this.getClass();
        if      (this == Type.SPADES)   return "Spades";
        else if (this == Type.DIAMONDS) return "Diamonds";
        else if (this == Type.HEARTS)   return "Hearts";
        else if (this == Type.CLUB)     return "Club";
        else return "";
    }

}