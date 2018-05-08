package units;

import org.junit.Test;

import static org.junit.Assert.*;

public class CruiserTest {

    @Test
    public void cruiserTest01() {
        Cruiser test01 = new Cruiser(0);
        assertTrue(test01.toString().equals("Cruiser{playerId=0, resourceCost=2, combatValue=7, movementSpeed=2, capacity=0}"));
    }

}