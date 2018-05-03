package units;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

public class Carrier implements Units {

    int resourceCost;
    int combatValue;
    int movementSpeed;
    int capacity;
    int load;
    int id;

    public Carrier(int id, int load) {
        this.resourceCost = getResourceCost();
        this.combatValue = getCombatValue();
        this.movementSpeed = getMovementSpeed();
        this.capacity = getCapacity();
        this.load = load;
        this.id=id;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Carrier{" +
                "resourceCost=" + resourceCost +
                ", combatValue=" + combatValue +
                ", movementSpeed=" + movementSpeed +
                ", capacity=" + capacity +
                ", load=" + load +
                ", id=" + id +
                '}';
    }
}
