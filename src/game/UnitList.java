//Jonas Emil Nielsen
//Jeni16@student.aau.dk
package game;

import space.Galaxy;
import units.Units;

import java.util.*;

public class UnitList {

    public static void unitList() {

        //Laver en Arraylist af Units in the Galaxy
        List<Units> allUnits = new ArrayList<>();

        for (int i = 0; i < Galaxy.getStarSystemInGalaxy().size() ; i++) {
            allUnits.addAll(Galaxy.getStarSystemInGalaxy().get(i).getUnitsInSystem().values());
        }

        //sort først efter ResourceCost i reversed og der efter CombatValut
        allUnits.sort(Comparator.comparingInt(Units::getResourceCost).reversed());
        allUnits.sort(Comparator.comparingInt(Units::getCombatValue));

        System.out.println(allUnits);
    }
}
