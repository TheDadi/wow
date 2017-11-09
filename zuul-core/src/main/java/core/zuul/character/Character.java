package core.zuul.character;

public class Character {

    private static final double MAX_CARRIABLE_WEIGHT = 100.0;
    private String name;
    private double canCarryWeight = MAX_CARRIABLE_WEIGHT;
    private CharacterType characterType;
    private CharacterState characterState;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCanCarryWeight() {
        return canCarryWeight;
    }

    public void setCanCarryWeight(double canCarryWeight) {
        this.canCarryWeight = canCarryWeight;
    }

    public CharacterState getCharacterState() {
        return characterState;
    }

    public void setCharacterState(CharacterState characterState) {
        this.characterState = characterState;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public void setCharacterType(CharacterType characterType) {
        this.characterType = characterType;
    }
}
