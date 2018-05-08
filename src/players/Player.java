package players;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import java.util.*;

public class Player {

    int id;
    public String name;
    public static String race;
    static String color;

    public Player(int id, String name, Object race, Object color) {
        this.id = id;
        this.name = name;
        this.race =  (String) race;
        this.color = (String) color;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "\n Player{" + "id=" + id + ", name='" + name + '\'' + ", race='" + race + '\'' + ", color='" + color + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Player) {
            if (((Player) o).race.equals(this.race)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public int hashCode() {

        return Objects.hash(race);
    }

}