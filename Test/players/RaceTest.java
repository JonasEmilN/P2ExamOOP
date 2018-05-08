package players;


import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class RaceTest {

    @Before
    public void arrayBefore01(){
        Race.addRaces();
    }

    @Test
    public void arrayRace01() {
        assertEquals(7,Race.races.size());
    }

    @Test
    public void arrayRace02() {
        assertEquals("The Barony of Letnev", Race.races.get(0));
    }

    @Test
    public void arrayRace03() {
        assertEquals("The Federation of Sol",Race.races.get(3));
    }

    @Test
    public void arrayRace04() {
        Race.races.remove(3);
        assertEquals("Awesome People of 304A",Race.races.get(3));
    }

}