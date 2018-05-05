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
    static int maxPlanet = 4; //Max +1 (hvis max er 3 så skriv 4)
    static int minPlant = 0;

    private static List<Planet> planetsInSystem = new ArrayList();

    static void addPlanets(int plants, String plant1Name, int plant1resource,
                             String plant2Name, int plant2resource,
                             String plant3Name, int plant3resource) {

        if (plants == 1) {
            planetsInSystem.add(new Planet(plant1Name,plant1resource));
        }
        else if (plants == 2) {
            planetsInSystem.add(new Planet(plant1Name,plant1resource));
            planetsInSystem.add(new Planet(plant2Name,plant2resource));
        }
        else if (plants == 3) {
            planetsInSystem.add(new Planet(plant1Name,plant1resource));
            planetsInSystem.add(new Planet(plant2Name,plant2resource));
            planetsInSystem.add(new Planet(plant3Name,plant3resource));
        }
        else {
            Random rpn = new Random();
            int p = rpn.nextInt(maxPlanet)+minPlant;

            for (; p > 0 ; p++) {
                planetsInSystem.add(new Planet("r",7));
            }

        }

    }



    public List<Units> unitsInSystem = new ArrayList<>();

    public void addUnit(Object unit) {

        unitsInSystem.add(unitsInSystem.size(), (Units) unit);

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
        addPlanets(plants,plant1Name,plant1resource,plant2Name,plant2resource,plant3Name,plant3resource);

    }

    @Override
    public String toString() {
        return "\n StarSystem{" +
                "Placement =\t'" + name + '\'' +
                ",\t neigthbors=" + neigthbors +
                ",\t Planet in system='" + planetsInSystem + '\'' +
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

    public static void main(String[] args){



        System.out.println("før test");





        StarSystem test1 = new StarSystem("lol",1,1,1,1,1,1
                ,1,1,4,"",1,"",1,"",1);


        System.out.println(test1);
        System.out.println("lol");
        System.out.println();


    }

}


