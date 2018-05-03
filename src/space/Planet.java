package space;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Planet {

    String name;
    int resources;
    int maxResources = 6;

    public static ArrayList planets() {

        final List<String> planets = new ArrayList<>();

        planets.add("Velnor");
        planets.add("Mirage");
        planets.add("Perimeter");
        planets.add("Vega Minor");
        planets.add("Vega Major");
        planets.add("Hope's End");
        planets.add("Rigel II");
        planets.add("Industrex");

        return (ArrayList) planets;
    }

    public int randomResources() {
        Random rr = new Random();
        this.resources = rr.nextInt(maxResources);
        return resources;
    }

    public int randomPlanet() {
        Random rp = new Random();
        return rp.nextInt(planets().size());

    }

    public Planet() {
        name = (String) planets().get(randomPlanet());
        resources = randomResources();

    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", resources=" + resources +
                '}';
    }

}
