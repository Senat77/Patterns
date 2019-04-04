package PersonsAndWeapons;

public class Troll extends Character {

    public Troll() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }

    @Override
    public String toString() {
        return "Troll{}";
    }
}
