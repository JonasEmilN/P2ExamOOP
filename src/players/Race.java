package players;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import java.util.ArrayList;
import java.util.List;

public class Race {

    final static List<String> races = new ArrayList<>();

    public static void addRaces() {

        races.add("The Barony of Letnev");
        races.add("The Clan of Saar");
        races.add("The Emirates of Hacan");
        races.add("The Federation of Sol");
        races.add("Gay Lords");
        races.add("Dwarf");
        races.add("Clan OP Jonas");

    }

    @Override
    public String toString() {
        return "\n Race{" + races + "}";
    }

}
