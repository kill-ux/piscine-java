public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.currentHealth = maxHealth;
        this.maxHealth = maxHealth;
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
}