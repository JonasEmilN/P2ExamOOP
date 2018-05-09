//Jonas Emil Nielsen
//Jeni16@student.aau.dk
package game;

import space.Galaxy;
import space.StarSystem;
import units.Destroyer;
import units.Dreadnought;
import units.Units;

import java.util.*;


public class Battle {


    public static void battle(StarSystem battleSite) {

        Random dice = new Random();
        Galaxy.getStarSystemInGalaxy().get(0).addUnit("5",new Dreadnought(1));
        Galaxy.getStarSystemInGalaxy().get(0).addUnit("6",new Destroyer(1));
        Galaxy.getStarSystemInGalaxy().get(0).addUnit("7",new Dreadnought(1));

        List<Units> player1 = new ArrayList<>();
        List<Units> player2 = new ArrayList<>();

        ArrayList test1234 = new ArrayList<>(Galaxy.getStarSystemInGalaxy().get(0).getUnitsInSystem().values());

        int players=0;
        String p1 = null;
        String p2 = null;
        for (int j = 0; j < test1234.size(); j++) {
            if (test1234.get(j).toString().contains("playerId = 0")) {
                players++;
                if (p1 == null) {
                    p1 = String.valueOf(j);
                }
                else if (p2 == null) {
                    p2 = String.valueOf(j);
                }
            }
            if (test1234.get(j).toString().contains("playerId = 1")) {
                players++;
                if (p1 == null) {
                    p1 = String.valueOf(j);
                }
                else if (p2 == null) {
                    p2 = String.valueOf(j);
                }
            }
            if (test1234.get(j).toString().contains("playerId = 2")) {
                players++;
                if (p1 == null) {
                    p1 = String.valueOf(j);
                }
                else if (p2 == null) {
                    p2 = String.valueOf(j);
                }
            }
            if (test1234.get(j).toString().contains("playerId = 3")) {
                players++;
                if (p1 == null) {
                    p1 = String.valueOf(j);
                }
                else if (p2 == null) {
                    p2 = String.valueOf(j);
                }
            }
            if (test1234.get(j).toString().contains("playerId = 4")) {
                players++;
                if (p1 == null) {
                    p1 = String.valueOf(j);
                }
                else if (p2 == null) {
                    p2 = String.valueOf(j);
                }
            }
            if (test1234.get(j).toString().contains("playerId = 5")) {
                players++;
                if (p1 == null) {
                    p1 = String.valueOf(j);
                }
                else if (p2 == null) {
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

        while (player1.size() > 0 || player2.size() > 0) {
            int player1Hits = 0;
            int player2Hits = 0;


            for (int i = 0; i < player1.size(); i++) {

                if (dice.nextInt(9)+1 > player1.get(i).getCombatValue()){
                    player1Hits++;
                }

            }

            for (int i = 0; i < player2.size(); i++) {

                if (dice.nextInt(9)+1 > player2.get(i).getCombatValue()){
                    player2Hits++;
                }

            }

            System.out.println(player1);
            System.out.println(player2);
            System.out.println(player1Hits);
            System.out.println(player2Hits);

            for (int i = 0; i < player2Hits; i++) {
                player1.remove(i);
            }


            for (int i = 0; i < player1Hits; i++) {
                player2.remove(i);
            }
        }
    }
}
