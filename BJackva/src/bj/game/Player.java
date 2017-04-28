package bj.game;

import bj.util.CardException;
import bj.util.Card;
import bj.util.Hand;
import java.lang.IllegalArgumentException;

public class Player{

    private int bank;
    private boolean status;
    private Hand h;
    private String name;
    private int number;
    
    
    public Player(String name, int number){
        h = new Hand();
        status = true;
        bank=0;
        this.name = name;
        this.number=number;
    }
    
    public Player(){
        h = new Hand();
        status = true;
        bank=0;
        this.name = "";
    }
    
    public void setNumber(int number){
        this.number=number;
    }
    
    public int getNumber(){
        return this.number;
    }

    public void addCard(Card c){
        if (c==null) System.out.print("La carta es nula.");
        else{
            h.newCard(c);
            if (h.getValue()>=22) status=false;
        }
    }
    
    public String getName(){
        return name;
    }
    
    public Hand getHand(){
        return h;
    }

    public int getPoints(){
        return h.getValue();
    }

    public void setMoney(double money){
        bank += money;
    }

    public void bet(double chip){
        if (chip>bank) System.out.println("NO TIENES SUFICIENTE DINERO!");
        else bank-=chip;
    }
    
    public void setStatus(boolean b){
        status=b;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void reboot(){
        h = new Hand();
        status = true;
    }

}