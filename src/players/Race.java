package players;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import java.util.HashMap;


public class Race {

    static HashMap<String, String> races = new HashMap<>();

    public static void Race() {
        races.put("1","The Barony of Letnev");
        races.put("2", "The Clan of Saar");
        races.put("3","The Emirates of Hacan");
        races.put("4","The Federation of Sol");
        races.put("5","Gay Lords");
        races.put("6","Space Dwarf");
        races.put("7","Clan OP Jonas");
    }

    public HashMap<String, String> getRaces() {
        return races;
    }

}
