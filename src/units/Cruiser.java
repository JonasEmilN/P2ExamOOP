package units;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

public class Cruiser implements Units {

    int playerId;
    int resourceCost;
    int combatValue;
    int movementSpeed;
    int capacity;

    public Cruiser(int playerId) {
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
        return 2;
    }

    @Override
    public int getCombatValue() {
        return 7;
    }

    @Override
    public int getMovementSpeed() {
        return 2;
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public String toString() {
        return "Cruiser{" +
                "playerId=" + playerId +
                ", resourceCost=" + resourceCost +
                ", combatValue=" + combatValue +
                ", movementSpeed=" + movementSpeed +
                ", capacity=" + capacity +
                '}';
    }
}
