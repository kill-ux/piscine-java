import java.util.ArrayList;
import java.util.List;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth) {
        this.name = name;
        this.currentHealth = maxHealth;
        this.maxHealth = maxHealth;
        allCharacters.add(this);
    }

    @Override
    public String toString() {
        if (currentHealth == 0) {
            return String.format("%s : KO", this.name);
        }
        return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void takeDamage(int subtract) {
        if (this.currentHealth - subtract < 0) {
            this.currentHealth = 0;
        } else {
            this.currentHealth -= subtract;
        }
    }

    public void attack(Character character) {
        character.takeDamage(9);
    }

    public static String printStatus() {
        String str = "------------------------------------------\n";

        if (allCharacters.size() == 0) {
            str += "Nobody's fighting right now !\n";
        } else {
            str += "Characters currently fighting : \n";
        }

        for (Character ch : allCharacters) {
            str += String.format(" - %s\n", ch.toString());
        }

        str += "------------------------------------------\n";
        return str;
    }

    public static Character fight(Character ch1, Character ch2) {
        while (true) {
            ch1.attack(ch2);
            if (ch2.currentHealth == 0) {
                return ch1;
            }
            ch2.attack(ch1);
            if (ch1.currentHealth == 0) {
                return ch2;
            }
        }
    }
}