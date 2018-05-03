package space;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import units.Units;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StarSystem {

    String name;
    int placement;
    int neigthbors;
    int north;
    int northEast;
    int southEast;
    int south;
    int southWest;
    int northWest;
    int resourcesPlanet;
    int ships;
    int maxPlanet = 4; //Max +1 (hvis max er 3 så skriv 4)
    int minPlant = 0;

    public ArrayList planets() {
        Random rpn = new Random();

        int p = rpn.nextInt(maxPlanet)+minPlant;

        List<Planet> planetsInSystem = new ArrayList();

        while (p > 0) {

            planetsInSystem.add(new Planet());
            p--;
        }

        return (ArrayList) planetsInSystem;

    }

    public ArrayList units() {

        List<Units> unitsInSystem = new ArrayList<>();

        return (ArrayList) unitsInSystem;
    }

    public StarSystem(String name, int placement, int neigthbors, int north, int northEast, int southEast, int south, int southWest, int northWest) {
        this.name = name;
        this.placement = placement;
        this.neigthbors = neigthbors;
        this.north = north;
        this.northEast = northEast;
        this.southEast = southEast;
        this.south = south;
        this.southWest = southWest;
        this.northWest = northWest;
    }

    @Override
    public String toString() {
        return "\n StarSystem{" +
                "Placement =\t'" + name + '\'' +
                ",\t neigthbors=" + neigthbors +
                ",\t Planet in system='" + planets() + '\'' +
                ",\t Units in system='" + units() + '\'' +
                ",\t resourcesPlanet=" + resourcesPlanet +
                ",\t north='" + north + '\'' +
                ",\t northEast='" + northEast + '\'' +
                ",\t southEast='" + southEast + '\'' +
                ",\t south='" + south + '\'' +
                ",\t southWest='" + southWest + '\'' +
                ",\t northWest='" + northWest + '\'' +
                ",\t ships=" + ships +
                ",\t maxPlanet=" + maxPlanet +
                '}';
    }


}


