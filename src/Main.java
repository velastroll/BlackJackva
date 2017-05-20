package game;

import game.Player;
import util.Deck;
import util.Card;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{

    public static Deck baraja;
    public static Player player;
    public static Player player2;
    public static Player player3;
    public static Player croupier;
    public static ArrayList<Player> mesa;

    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);
        System.out.print("BIENVENIDO AL BLACKJACK!!\nCual es su nombre?: ");

        try{
            String nombre = teclado.nextLine();
            System.out.print("\n Hola " + nombre + ". Con cuanto dinero quiere jugar?: "); 
            player = new Player(nombre);
            double dinero = teclado.nextDouble();
            player.setMoney(dinero);

            System.out.print("> Jugador: " + player.getName() + "\t\tDinero: " + player.getBank() + "€.");
        }
        catch (InputMismatchException e){
            System.out.println("VAYA VAYA");
        }         


        /**
        baraja = new Deck();
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();
        croupier = new Player();
        player1.setMoney(100);
        player2.setMoney(75);
        player3.setMoney(50);
        mesa = new ArrayList<Player>();
        mesa.add(player1);
        mesa.add(player2);
        mesa.add(player3);
        mesa.add(croupier);

        repartir();

        System.out.println("\nPlayer1: "+player1.getPoints());
        System.out.println("Player2: "+player2.getPoints());
        System.out.println("Player3: "+player3.getPoints());
        System.out.println("Croupier: "+croupier.getPoints());
        **/
    }

    public static void repartir(){
        System.out.print("-- REPARTIENDO--\n");
        int i=0;
        for(Player p: mesa){
            i++;
            System.out.print("\t");
            Card c = baraja.getCard();
            p.addCard(c);
        }
        i=0;
        System.out.print("\n");
        for(Player p: mesa){
            i++;
            System.out.print("\t");
            Card c = baraja.getCard();
            p.addCard(c);
        }
    }
}