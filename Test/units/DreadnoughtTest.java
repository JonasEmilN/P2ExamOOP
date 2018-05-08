package units;

import org.junit.Test;

import static org.junit.Assert.*;

public class DreadnoughtTest {

    @Test
    public void dreadnoughtTest01() {
        Dreadnought test01 = new Dreadnought(0);
        System.out.println(test01);
        assertTrue(test01.toString().equals("Dreadnought{playerId=0, resourceCost = 5, combatValue = 5, movementSpeed = 1, capacity = 0}"));
    }

}