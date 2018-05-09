//Jonas Emil Nielsen
//Jeni16@student.aau.dk
package space;

import java.util.ArrayList;
import java.util.List;

public class Galaxy {

    static List<StarSystem> starSystemInGalaxy = new ArrayList<>();

    public static List<StarSystem> getStarSystemInGalaxy() {
        return starSystemInGalaxy;
    }

    @Override
    public String toString() {
        return "Galaxy{" + starSystemInGalaxy;
    }

    public static void main(String[] args) {

        System.out.println("før test");

        Galaxy test1 = new Galaxy();

        System.out.println("Galaxy lavet.");

        System.out.println(starSystemInGalaxy);

        System.out.println("random done");

        System.out.println(test1);
        System.out.println();
    }
}
