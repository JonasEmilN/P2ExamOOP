package game;

import java.util.Random;

public class Attack {

    int combatValue;

    public int teenside() {

        Random dice = new Random();
        return dice.nextInt(11)+1;
    }

    public boolean Attack(int combatValue) {
        this.combatValue = combatValue;

        if (combatValue < teenside()) {
            return true;
        }
        else {
            return false;
        }
        
    }





}
