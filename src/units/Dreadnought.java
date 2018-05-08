package units;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

public class Dreadnought implements Units {

    private int playerId;
    private int resourceCost;
    private int combatValue;
    private int movementSpeed;
    private int capacity;

    public Dreadnought(int playerId) {
        this.resourceCost = getResourceCost();
        this.combatValue = getCombatValue();
        this.movementSpeed = getMovementSpeed();
        this.capacity = getCapacity();
        this.playerId = playerId;
    }

    @Override
    public int getPlayerId() {
        return playerId;
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
                "playerId=" + playerId +
                ", resourceCost = " + resourceCost +
                ", combatValue = " + combatValue +
                ", movementSpeed = " + movementSpeed +
                ", capacity = " + capacity +
                '}';
    }
}
