package players;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Before
    public void testPlayer01() {
        Race.addRaces();
        Color.addColors();
    }

    @Test //Test af toString()
    public void testPlayer02() {
        Player p1test = new Player(0,"Test",Race.races.get(0),Color.colors.get(0));
        System.out.println(p1test.toString());
        assertTrue(p1test.toString().equals("\n Player{id=0, name='Test', race='The Barony of Letnev', color='Red'}"));
    }

    @Test
    public void testPlayer03() {
        
    }


}