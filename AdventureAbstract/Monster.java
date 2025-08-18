
public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() != 0) {
            return String.format("%s is a monster with %s HP", this.getName(), this.getCurrentHealth());
        }
        return String.format("%s is a monster and is dead", this.getName());
    }

    @Override
    public void attack(Character character) {
        character.takeDamage(7);
    }

    @Override
    public void takeDamage(int subtract) {
        int sub = (int) Math.floor(this.getCurrentHealth() * 0.8);
        if (this.getCurrentHealth() - sub < 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(this.getCurrentHealth() - sub);
        }
    }
}
