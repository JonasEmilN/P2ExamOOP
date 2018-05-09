//Jonas Emil Nielsen
//Jeni16@student.aau.dk
package game;

import space.Galaxy;
import units.Units;

import java.util.*;


public class Battle {


    public static void battle(int battleSite) {

        Random dice = new Random();

        List<Units> player1 = new ArrayList<>();
        List<Units> player2 = new ArrayList<>();

        ArrayList test1234 = new ArrayList<>(Galaxy.getStarSystemInGalaxy().get(battleSite).getUnitsInSystem().values());

        int players = 0;
        String p1 = null;
        String p2 = null;
        for (int j = 0; j < test1234.size(); j++) {
            if (test1234.get(j).toString().contains("playerId = 0")) {
                players++;
                if (p1 == null) {
                    p1 = String.valueOf(j);
                } else if (p2 == null) {
                    p2 = String.valueOf(j);
                }
            }
            if (test1234.get(j).toString().contains("playerId = 1")) {
                players++;
                if (p1 == null) {
                    p1 = String.valueOf(j);
                } else if (p2 == null) {
                    p2 = String.valueOf(j);
                }
            }
            if (test1234.get(j).toString().contains("playerId = 2")) {
                players++;
                if (p1 == null) {
                    p1 = String.valueOf(j);
                } else if (p2 == null) {
                    p2 = String.valueOf(j);
                }
            }
            if (test1234.get(j).toString().contains("playerId = 3")) {
                players++;
                if (p1 == null) {
                    p1 = String.valueOf(j);
                } else if (p2 == null) {
                    p2 = String.valueOf(j);
                }
            }
            if (test1234.get(j).toString().contains("playerId = 4")) {
                players++;
                if (p1 == null) {
                    p1 = String.valueOf(j);
                } else if (p2 == null) {
                    p2 = String.valueOf(j);
                }
            }
            if (test1234.get(j).toString().contains("playerId = 5")) {
                players++;
                if (p1 == null) {
                    p1 = String.valueOf(j);
                } else if (p2 == null) {
                    p2 = String.valueOf(j);
                }
            }
        }

        for (int i = 0; i < test1234.size(); i++) {
            if (test1234.get(i).toString().contains("playerId = " + p1)) {
                player1.add((Units) test1234.get(i));
            }
        }

        for (int i = 0; i < test1234.size(); i++) {
            if (test1234.get(i).toString().contains("playerId = " + p2)) {
                player2.add((Units) test1234.get(i));
            }
        }

        //sort for easy remove/destroy
        player1.sort(Comparator.comparingInt(Units::getResourceCost));
        player2.sort(Comparator.comparingInt(Units::getResourceCost));

        //Hit counters
        int player1Hits = 0;
        int player2Hits = 0;

        while (player1.size() != 0 && player2.size() != 0) {
            player1Hits = 0;
            player2Hits = 0;


            for (int i = 0; i < player1.size(); i++) {
                if (dice.nextInt(9) + 1 > player1.get(i).getCombatValue()) {
                    player1Hits++;
                }
            }

            for (int i = 0; i < player2.size(); i++) {

                if (dice.nextInt(9) + 1 > player2.get(i).getCombatValue()) {
                    player2Hits++;
                }
            }

            for (int i = 0; i < player2Hits; i++) {
                if (player1.size() > 0) {
                    player1.remove(i);
                }
            }

            for (int i = 0; i < player1Hits; i++) {
                if (player2.size() > 0) {
                    player2.remove(i);
                }
            }
        }

        if (player1.size() == 0) {
            System.out.println("player 2 won the space battle");
        } else if (player2.size() == 0) {
            System.out.println("Player 1 won the space battle");
        } else {
            System.out.println("Draw!");
        }
    }
}
