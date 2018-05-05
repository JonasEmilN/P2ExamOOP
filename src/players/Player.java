package players;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import java.util.*;

public class Player {

    int id;
    private String name;
    private static String race;
    private static String color;

    public Player(int id, String name, String race, String color) {
        this.id = id;
        this.name = name;
        this.race = (String) race;
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
        return "\n Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", color='" + color + '\'' +
                '}';
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



    public static void main(String[] args){
        Race.Race();
        Color.Color();


        System.out.println(Race.races);
        System.out.println("før remove");
        Race.races.remove("1");
        System.out.println(Race.races);

    }



}