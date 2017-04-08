package util;
public enum Card{
    TWO(), THREE(), FOUR(), FIVE(),
    SIX(), SEVEN(), EIGHT(), NINE(),
    TEN(), JACK(), QUEEN(), KING(), ACE();

    Type type = null;

    public void setType(Type ty){
        this.type = ty;
    }

    public String getTypeStr(){
        return type.getTypeString();
    }
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
    public static void main (String[] args){ 
        Type espadas = Type.SPADES;
        Card carta = Card.ACE;
        carta.setType(espadas);
        System.out.print(carta.getNumberStr() + " de " + carta.getTypeStr() + "\n");
    }
    **/
}