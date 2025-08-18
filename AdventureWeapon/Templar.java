public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
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
    public int getShield() {
        return this.shield;
    }

    @Override
    public String toString() {
        return this.getCurrentHealth() == 0
                ? String.format(
                        "%s has been beaten, even with its %d shield. So bad, it could heal %d HP. He has the weapon %s",
                        this.getName(), this.getShield(), this.getHealCapacity(), this.getWeapon().toString())
                : String.format(
                        "%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d. He has the weapon %s",
                        this.getName(), this.getCurrentHealth(), this.getHealCapacity(), this.getShield(),
                        this.getWeapon().toString());
    }

    @Override
    public void attack(Character character) {
        this.heal(this);
        int value = 6;
        if (this.getWeapon() != null) {
            value = this.getWeapon().getDamage();
        }
        character.takeDamage(value);
    }

    @Override
    public void takeDamage(int subtract) {
        int sub = subtract - this.shield;
        if (this.getCurrentHealth() - sub < 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(this.getCurrentHealth() - sub);
        }
    }

}