public class DeadCharacterException extends Exception {
    private Character character;

    DeadCharacterException(Character ch) {
        ch.setCurrentHealth(0);
        this.character = ch;
    }

    public String getMessage() {
        return String.format("The %s %s is dead.", character.getClass().getName().toLowerCase(), character.getName());
    }
}

