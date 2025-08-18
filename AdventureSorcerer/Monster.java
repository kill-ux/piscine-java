
public class Monster extends Character {

    public Monster(String name,int maxHealth){
        super(name, maxHealth);
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() != 0) {
            return String.format("%s is a monster with %s HP", this.getName(),this.getCurrentHealth());
        }
        return String.format("%s is a monster and is dead", this.getName());
    }
}
