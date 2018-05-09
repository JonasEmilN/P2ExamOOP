//Jonas Emil Nielsen
//Jeni16@student.aau.dk
package space;

import units.Units;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class StarSystem {

    private String name;
    public int placement;
    private int neigthbors;
    public int north;
    public int northEast;
    public int southEast;
    public int south;
    public int southWest;
    public int northWest;
    private static int maxPlanet = 4; //Max +1 (hvis max er 3 så skriv 4)
    private static int minPlant = 0;

    public List<Planet> planetsInSystem = new ArrayList();

    void addPlanets(int plants, String plant1Name, int plant1resource,
                    String plant2Name, int plant2resource,
                    String plant3Name, int plant3resource) {

        if (plants == 0) {

        } else if (plants == 1) {
            planetsInSystem.add(new Planet(plant1Name, plant1resource));
        } else if (plants == 2) {
            planetsInSystem.add(new Planet(plant1Name, plant1resource));
            planetsInSystem.add(new Planet(plant2Name, plant2resource));
        } else if (plants == 3) {
            planetsInSystem.add(new Planet(plant1Name, plant1resource));
            planetsInSystem.add(new Planet(plant2Name, plant2resource));
            planetsInSystem.add(new Planet(plant3Name, plant3resource));
        } else if (plants == 4) {
            Random rpn = new Random();
            int p = rpn.nextInt(maxPlanet) + minPlant;

            for (; p > 0; p++) {
                planetsInSystem.add(new Planet("r", 7));
            }
        } else {
            Random rpn = new Random();
            int p = rpn.nextInt(maxPlanet) + minPlant;

            for (; p > 0; p++) {
                planetsInSystem.add(new Planet("r", 7));
            }

        }

    }

    HashMap<String, Units> unitsInSystem = new HashMap<>();

    public HashMap<String, Units> getUnitsInSystem() {
        return unitsInSystem;
    }

    public void addUnit(String id, Object unit) {

        unitsInSystem.put(id, (Units) unit);

    }

    public StarSystem(String name, int placement, int neighbors, int north, int northEast
            , int southEast, int south, int southWest, int northWest, int plants
            , String plant1Name, int plant1resource, String plant2Name
            , int plant2resource, String plant3Name, int plant3resource) {
        this.name = name;
        this.placement = placement;
        this.neigthbors = neighbors;
        this.north = north;
        this.northEast = northEast;
        this.southEast = southEast;
        this.south = south;
        this.southWest = southWest;
        this.northWest = northWest;
        addPlanets(plants, plant1Name, plant1resource, plant2Name, plant2resource, plant3Name, plant3resource);

    }

    @Override
    public String toString() {
        return "\n StarSystem{" +
                "Placement =\t'" + name + '\'' +
                ",\t Units in system='" + unitsInSystem + '\'' +
                ",\t Planet in system='" + planetsInSystem + '\'' +
                ",\t neigthbors=" + neigthbors +
                ",\t north='" + north + '\'' +
                ",\t northEast='" + northEast + '\'' +
                ",\t southEast='" + southEast + '\'' +
                ",\t south='" + south + '\'' +
                ",\t southWest='" + southWest + '\'' +
                ",\t northWest='" + northWest + '\'' +
                '}';
    }
}