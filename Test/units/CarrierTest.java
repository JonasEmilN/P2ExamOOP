package units;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarrierTest {

    @Test
    public void carrierTest01() {
        Carrier test01 = new Carrier(0, 0);
        assertTrue(test01.toString().equals("Carrier{playerId=0, resourceCost=3, combatValue=9, movementSpeed=1, capacity=6, load=0}"));
    }

    @Test
    public void carrierTest02() {

    }
}