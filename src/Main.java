//Jonas Emil Nielsen
//Jeni16@student.aau.dk


import players.Color;
import players.Player;
import players.Race;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args){

        Set<Player> players = new HashSet<>();

        Player p1 = new Player(0 ,"Jonas",Race.races().get(1), Color.colors().get(0));
        Player p2 = new Player(1,"Jeppe", Race.races().get(2),Color.colors().get(1));
        Player p3 = new Player(2 ,"Jonas",Race.races().get(3), Color.colors().get(2));
        Player p4 = new Player(3, "Jeppe", Race.races().get(1), Color.colors().get(3));

        int max = 6;
        int antal = 4;
        int k = 1;

        for (int c = 0; c < antal; c++){

            Scanner sc = new Scanner(System.in);

            Player play1 = new Player(c,"","",Color.colors().get(c));

            System.out.println("Enter Player 1 Name");

            play1.name = sc.nextLine();

            System.out.println("Chosse Race Player 1\n" + Race.races());

            k.Race




            k++

        }

        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);


        System.out.println(Color.colors());

        System.out.println(Race.races());

        System.out.println("antal spiller " + players.size());
        System.out.println(players);



    }



}




