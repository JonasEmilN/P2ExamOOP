//Jonas Emil Nielsen
//Jeni16@student.aau.dk
package units;

public class Carrier implements Units {

    private int resourceCost;
    private int combatValue;
    private int movementSpeed;
    private int capacity;
    private int load;
    private int playerId;

    public Carrier(int playerId, int load) {
        this.resourceCost = getResourceCost();
        this.combatValue = getCombatValue();
        this.movementSpeed = getMovementSpeed();
        this.capacity = getCapacity();
        this.load = load;
        this.playerId = playerId;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public int getPlayerId() {
        return playerId;
    }

    @Override
    public int getResourceCost() {
        return 3;
    }

    @Override
    public int getCombatValue() {
        return 9;
    }

    @Override
    public int getMovementSpeed() {
        return 1;
    }

    @Override
    public int getCapacity() {
        return 6;
    }

    @Override
    public String toString() {
        return "\nCarrier     {\t" +
                "playerId = " + playerId +
                ", resourceCost = " + resourceCost +
                ", combatValue = " + combatValue +
                ", movementSpeed = " + movementSpeed +
                ", capacity = " + capacity +
                ", load = " + load +
                '}';
    }
}
