package PersonsAndWeapons;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Bow shot");
    }
}
