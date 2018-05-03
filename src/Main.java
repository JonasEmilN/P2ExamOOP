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

        //Hardcode 6 spiller og 1 npc. da jeg ved der max må være 6 deltager.
        Player p1 = new Player(0,"","",Color.colors().get(0));
        Player p2 = new Player(1,"","",Color.colors().get(1));
        Player p3 = new Player(2,"","",Color.colors().get(2));
        Player p4 = new Player(3,"","",Color.colors().get(3));
        Player p5 = new Player(4,"","",Color.colors().get(4));
        Player p6 = new Player(5,"","",Color.colors().get(5));
        Player npc = new Player(6,"NPC","NPC",Color.colors().get(6));

        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);
        players.add(npc);

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to OpOp spil \n Enter Number of player (min 2 and max 6 players)");

        int total = sc.nextInt();

        //While loot så jeg får den input jeg vil ha.
        int c = 0;
        while (c < 1) {
            if (total > 1 && total < players.size()) {
                total = sc.nextInt();
                c++;
            }
            else {
                System.out.println("Only numbers 2-6 is allowed");
                total = sc.nextInt();
            }
        }

        for (int i = 0; i < total-1; i++) {

            if (i == 0) {
                System.out.println("Enter player 1 name");
                p1.name = sc.nextLine();

                System.out.println("Choose race\n" + Race.races());

                int raceNumber = sc.nextInt();
                c = 0;
                while (c < 1) {
                    if (raceNumber > -1 && raceNumber < Race.races().size()){
                        //p1.race = Race.races().toString();
                    }
                }
                total = sc.nextInt();
                c++;


            }
            else if (i == 1){
                System.out.println("Enter player 2 name");
                p1.name = sc.nextLine();

            }
            else if (i == 2){
                System.out.println("Enter player 3 name");
                p1.name = sc.nextLine();

            }
            else if (i == 3){
                System.out.println("Enter player 4 name");
                p1.name = sc.nextLine();

            }
            else if (i == 4){
                System.out.println("Enter player 5 name");
                p1.name = sc.nextLine();

            }
            else if (i == 5){
                System.out.println("Enter player 6 name");
                p1.name = sc.nextLine();

            }




        }












        System.out.println("antal spiller " + players.size());
        System.out.println(players);



    }



}




