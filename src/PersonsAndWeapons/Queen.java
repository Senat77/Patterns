package PersonsAndWeapons;

public class Queen extends Character {

    public Queen() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }

    @Override
    public String toString() {
        return "Queen{}";
    }
}
