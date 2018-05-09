//Jonas Emil Nielsen
//Jeni16@student.aau.dk
package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ColorTest {

    @Before
    public void arrayBefore01(){
        Color.addColors();
    }

    @Test
    public void arrayColor01() {
        assertEquals(7,Color.colors.size());
    }

    @Test
    public void arrayColor02() {
        assertEquals("Red", Color.colors.get(0));
    }

    @Test
    public void arrayColor03() {
        assertEquals("Yellow",Color.colors.get(3));
    }

    @Test
    public void arrayColor04() {
        Color.colors.remove(3);
        assertEquals("Pink",Color.colors.get(3));
    }

}