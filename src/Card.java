package util;
public enum Card{
    TWO(), THREE(), FOUR(), FIVE(),
    SIX(), SEVEN(), EIGHT(), NINE(),
    TEN(), JACK(), QUEEN(), KING(), ACE();

    Type type;

    public void setType(Type ty){
        this.type = ty;
    }

    public String getTypeStr(){
        return type.getTypeString();
    }
    public String getNumberStr(){
        switch(this){
            case TWO:   return "dos";
            case ACE:   return "uno";
        }
        return"recorcholis";
    }
    public static void main (String[] args){ 
        Type espadas = Type.SPADES;
        Card carta = Card.ACE;
        carta.setType(espadas);
        System.out.print(carta.getNumberStr() + " de " + carta.getTypeStr() + "\n");
    }
}