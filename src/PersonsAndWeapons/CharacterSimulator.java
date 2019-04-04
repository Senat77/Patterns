package PersonsAndWeapons;

public class CharacterSimulator {

    public static void main(String[] args) {
        Character person = new King();
        System.out.println(person);
        person.fight();
        person.setWeapon(new SwordBehavior());
        person.fight();
        Character person2 = new Troll();
        System.out.println(person2);
        person2.fight();
    }
}
