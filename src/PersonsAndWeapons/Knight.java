package PersonsAndWeapons;

public class Knight extends Character {

    public Knight() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }

    @Override
    public String toString() {
        return "Knight{}";
    }
}
