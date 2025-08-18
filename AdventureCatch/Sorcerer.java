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
    public void heal(Character ch) throws DeadCharacterException {
         if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        if (ch.getCurrentHealth() + this.healCapacity <= ch.getMaxHealth()) {
            ch.setCurrentHealth(this.healCapacity + ch.getCurrentHealth());
        } else {
            ch.setCurrentHealth(ch.getMaxHealth());
        }
    }

    @Override
    public String toString() {
        return this.getCurrentHealth() == 0
                ? String.format("%s is a dead sorcerer. So bad, it could heal %d HP. He has the weapon %s",
                        this.getName(),
                        this.healCapacity, this.getWeapon().toString())
                : String.format("%s is a sorcerer with %d HP. It can heal %d HP. He has the weapon %s", this.getName(),
                        this.getCurrentHealth(), this.healCapacity, this.getWeapon().toString());
    }

    @Override
    public void attack(Character character) throws DeadCharacterException {
         if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        this.heal(this);
        int value = 10;
        if (this.getWeapon() != null) {
            value = this.getWeapon().getDamage();
        }
        character.takeDamage(value);
    }

    @Override
    public void takeDamage(int subtract) throws DeadCharacterException {
         if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        if (this.getCurrentHealth() - subtract < 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(this.getCurrentHealth() - subtract);
        }
    }
}
