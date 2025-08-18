
public class Monster extends Character {

    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() != 0) {
            return String.format("%s is a monster with %s HP He has the weapon %s", this.getName(),
                    this.getCurrentHealth(), this.getWeapon().toString());
        }
        return String.format("%s is a monster and is dead He has the weapon %S", this.getName(),
                this.getWeapon().toString());
    }

    @Override
    public void attack(Character character) {
        int value = 7;
        if (this.getWeapon() != null) {
            value = this.getWeapon().getDamage();
        }
        character.takeDamage(value);
    }

    @Override
    public void takeDamage(int subtract) {
        int sub = (int) (subtract * 0.8);
        if (this.getCurrentHealth() - sub < 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(this.getCurrentHealth() - sub);
        }
    }
}
