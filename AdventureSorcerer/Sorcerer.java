public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name,maxHealth);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character ch) {
        if (ch.currentHealth + this.healCapacity <= ch.getMaxHealth()) {
            ch.currentHealth += this.healCapacity;
        } else {
            ch.currentHealth = ch.getMaxHealth();
        }
    }

    @Override
    public String toString() {
        return this.getCurrentHealth() == 0
                ? String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(),
                        this.getCurrentHealth())
                : String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(),
                        this.getCurrentHealth(), this.getHealCapacity());
    }
}
