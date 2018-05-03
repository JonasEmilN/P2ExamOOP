package units;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

public class Dreadnought implements Units {

    int resourceCost;
    int combatValue;
    int movementSpeed;
    int capacity;

    public Dreadnought() {
        this.resourceCost = getResourceCost();
        this.combatValue = getCombatValue();
        this.movementSpeed = getMovementSpeed();
        this.capacity = getCapacity();
    }

    @Override
    public int getResourceCost() {
        return 5;
    }

    @Override
    public int getCombatValue() {
        return 5;
    }

    @Override
    public int getMovementSpeed() {
        return 1;
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public String toString() {
        return "Dreadnought{" +
                "resourceCost = " + resourceCost +
                ", combatValue = " + combatValue +
                ", movementSpeed = " + movementSpeed +
                ", capacity = " + capacity +
                '}';
    }
}
