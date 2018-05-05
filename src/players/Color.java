package players;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import java.util.HashMap;

public class Color {

    static HashMap<String, String> colors = new HashMap<>();

    public static void Color() {

        colors.put("1","Red");
        colors.put("2","Blue");
        colors.put("3","Green");
        colors.put("4","Yellow");
        colors.put("5","Pink");
        colors.put("6","Cyan");
        colors.put("7","Black");

    }

    @Override
    public String toString() {
        return "Color{}";
    }
}
