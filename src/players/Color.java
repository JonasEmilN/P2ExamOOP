package players;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import java.util.ArrayList;
import java.util.List;

public class Color {

    static final List<String> colors = new ArrayList<>();

    public static void addColors() {

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Cyan");
        colors.add("Black");

    }

    public List<String> getColors() {
        return colors;
    }
}
