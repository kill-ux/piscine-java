public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character ch) {
        if (ch.getCurrentHealth() + this.healCapacity <= ch.getMaxHealth()) {
            ch.setCurrentHealth(this.healCapacity + ch.getCurrentHealth());
        } else {
            ch.setCurrentHealth(ch.getMaxHealth());
        }
    }

    @Override
    public String toString() {
        return this.getCurrentHealth() == 0
                ? String.format("%s is a dead sorcerer. So bad, it could heal %d HP. He has the weapon %s", this.getName(),
                        this.healCapacity, this.getWeapon().toString())
                : String.format("%s is a sorcerer with %d HP. It can heal %d HP. He has the weapon %s", this.getName(),
                        this.getCurrentHealth(), this.healCapacity, this.getWeapon().toString());
    }

    @Override
    public void attack(Character character) {
        this.heal(this);
        character.takeDamage(10);
    }

    @Override
    public void takeDamage(int subtract) {
        if (this.getWeapon() == null) {
            if (this.getCurrentHealth() - subtract < 0) {
                this.setCurrentHealth(0);
            } else {
                this.setCurrentHealth(this.getCurrentHealth() - subtract);
            }
        } else {
            if (this.getCurrentHealth() - this.getWeapon().getDamage() < 0) {
                this.setCurrentHealth(0);
            } else {
                this.setCurrentHealth(this.getCurrentHealth() - this.getWeapon().getDamage());
            }
        }
    }
}
