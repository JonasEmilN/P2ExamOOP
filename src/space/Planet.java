//Jonas Emil Nielsen
//Jeni16@student.aau.dk
package space;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Planet {

    public String name;
    int resources;
    int maxResources = 6;
    int minResources = 0;

    final static List<String> planets = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public static void addPlanetNames() {

        planets.add("Velnor");
        planets.add("Mirage");
        planets.add("Perimeter");
        planets.add("Vega Minor");
        planets.add("Vega Major");
        planets.add("Hope's End");
        planets.add("Rigel I");
        planets.add("Rigel II");
        planets.add("Industrex");
        planets.add("Mecatol Rex");
    }

    public int randomResources() {
        Random rr = new Random();
        this.resources = rr.nextInt(maxResources);
        return resources;
    }

    public int randomPlanet() {
        Random rp = new Random();
        return rp.nextInt(planets.size());

    }

    public Planet(String name, int resources) {
        Planet.addPlanetNames();
        if (planets.contains(name)) {
            this.name = name;
        } else {
            this.name = planets.get(randomPlanet());
        }

        if (resources > minResources - 1 && resources < maxResources + 1) {
            this.resources = resources;
        } else {
            this.resources = randomResources();
        }

    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", resources=" + resources +
                '}';
    }

}
