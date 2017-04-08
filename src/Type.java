package util;
public enum Type{

    SPADES(), DIAMONDS(), HEARTS(), CLUB();

    public String getTypeString(){
        Class c = this.getClass();
        if (this == Type.SPADES)   return "Spades";
        else if (this == Type.DIAMONDS) return "Diamonds";
        else if (this == Type.HEARTS)   return "Hearts";
        else if (this == Type.CLUB)     return "Club";
        else return "Hola!";
    }

}