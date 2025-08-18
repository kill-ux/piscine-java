public class ExerciseRunner {

    public static void main(String[] args) {
        Weapon narsil = new Weapon("Narsil", 15);
        Weapon baguette = new Weapon("Baguette magique", 20);
        Weapon massue = new Weapon("Massue", 8);
        Monster troll = new Monster("Troll", 30, massue);
        Sorcerer dumbledore = new Sorcerer("Dumbledore", 25, 5, baguette);
        Templar alistair = new Templar("Alistair", 18, 2, 3, narsil);

        Weapon q = new Weapon("Baguette", 16);
        Sorcerer dragoMalefoy = new Sorcerer("Drago Malefoy", 20, 2, null);
        Sorcerer harryPotter = new Sorcerer("Harry Potter", 30, 4, q);

        harryPotter.attack(dragoMalefoy);
        System.out.println(dragoMalefoy.getCurrentHealth());

        // Character.fight(alistair, troll);

        // System.out.println(Character.printStatus());
    }
}