package space;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import units.Carrier;
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

        for (; p < 1; p--) {
            planetsInSystem.add(new Planet());
        }




        return (ArrayList) planetsInSystem;

    }

    public List<Units> unitsInSystem = new ArrayList<>();

    public void addUnit(Object unit) {

        unitsInSystem.add(unitsInSystem.size(), (Units) unit);

    }



    public StarSystem(String name, int placement, int neighbors, int north, int northEast, int southEast, int south, int southWest, int northWest) {
        this.name = name;
        this.placement = placement;
        this.neigthbors = neighbors;
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
                ",\t Units in system='" + unitsInSystem + '\'' +
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

    public List<Units> getUnitsInSystem() {
        return unitsInSystem;
    }

    public static void main(String[] args){

        System.out.println("før test");

        StarSystem test1 = new StarSystem("lol",1,1,1,1,1,1,1,1);

        Carrier test2 = new Carrier(0,0);

        test1.unitsInSystem.add(0,test2);

        System.out.println(test1);
        System.out.println("lol");
        System.out.println(test2);


    }

}


