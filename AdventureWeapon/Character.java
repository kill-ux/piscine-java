import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private Weapon weapon;

    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth, Weapon weapon) {
        this.name = name;
        this.currentHealth = maxHealth;
        this.maxHealth = maxHealth;
        this.weapon = weapon;
        allCharacters.add(this);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    protected void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
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

    public abstract void takeDamage(int subtract);

    public abstract void attack(Character character);

    public static String printStatus() {
        if (allCharacters.size() == 0) {
            return """
                    ------------------------------------------
                    Nobody's fighting right now !
                    ------------------------------------------
                    """;
        } else {
            String str = "------------------------------------------\n";

            str += "Characters currently fighting :\n";

            for (Character ch : allCharacters) {
                str += String.format(" - %s\n", ch.toString());
            }

            str += "------------------------------------------\n";
            return str;
        }
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