package units;

import org.junit.Test;

import static org.junit.Assert.*;

public class DestroyerTest {

    @Test
    public void destroyerTest01() {
        Destroyer test01 = new Destroyer(0);
        assertTrue(test01.toString().equals("Destroyer{playerId=0, resourceCost = 1, combatValue = 9, movementSpeed = 2, capacity = 0}"));
    }

}