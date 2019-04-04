package PersonsAndWeapons;

public class King extends Character {

    public King() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }

    @Override
    public String toString() {
        return "King{}";
    }
}
