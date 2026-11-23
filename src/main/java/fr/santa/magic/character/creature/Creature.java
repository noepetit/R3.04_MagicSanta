package fr.santa.magic.character.creature;
import fr.santa.magic.character.Character;
import fr.santa.magic.character.Sex;

public abstract class Creature extends Character {
    public Creature(String name, Sex sex, int age) {
        super(name, sex, age);
    }
}

