package players;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import java.util.ArrayList;
import java.util.List;

public class Race {

    static List<String> races = new ArrayList<>();

    public static void addRaces() {

        races.add("The Barony of Letnev");
        races.add("The Clan of Saar");
        races.add("The Emirates of Hacan");
        races.add("The Federation of Sol");
        races.add("Awesome People of 304A");
        races.add("Space Dwarf");
        races.add("Energi Drinkers");

    }

    List<String> getRaces() {
        return races;
    }

    @Override
    public String toString() {
        return "\n Race{" + races + "}";
    }

}
