public class DeadCharacterException extends Exception {
    private Character character;

    public DeadCharacterException(Character ch) {
        ch.setCurrentHealth(0);
        this.character = ch;
    }

    public String getMessage() {
        return String.format("The %s %s is dead.", character.getClass().getSimpleName().toLowerCase(), character.getName());
    }
}

