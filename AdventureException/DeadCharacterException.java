public class DeadCharacterException extends Exception {
    private Character character;

    DeadCharacterException(Character ch) {
        ch.setCurrentHealth(0);
        this.character = ch;
    }

    public String getMessage() {
        System.out.println("[DEBUG] Class name: " + character.getClass().getSimpleName().toLowerCase());
        return String.format("The %s %s is dead.", character.getClass().getSimpleName().toLowerCase(), character.getName());
    }
}

