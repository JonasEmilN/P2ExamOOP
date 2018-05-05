//Jonas Emil Nielsen
//Jeni16@student.aau.dk



import game.GameSetup;
import space.Galaxy;
import space.StarSystem;
import units.Carrier;


public class Main {

    public void testtest() {



    }


    public static void main(String[] args){

        System.out.println("før test");

        Galaxy test1 = new Galaxy();

        test1.randomGalaxy();



        Carrier test2 = new Carrier(0,0);

        test1.getStarSystemInGalaxy().get(0).unitsInSystem.add(test2);

        test1.getStarSystemInGalaxy().get(0).unitsInSystem.get(1) =
                test1.getStarSystemInGalaxy().get(0).unitsInSystem.get(0);



        System.out.println(test1);
        System.out.println();
        System.out.println(test2);


    }



}




