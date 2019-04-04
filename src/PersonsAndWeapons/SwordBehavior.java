package PersonsAndWeapons;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Sword blow");
    }
}
