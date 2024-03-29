package PersonsAndWeapons;

public abstract class Character {

    WeaponBehavior weapon;

    public Character() {
    }

    public abstract void fight();

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }
}
