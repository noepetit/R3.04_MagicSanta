package fr.santa.magic.character.humanoide;

import fr.santa.magic.character.Character;
import fr.santa.magic.character.Sex;

public abstract class Humanoid extends Character {
    public Humanoid(String name, Sex sex, int age) {
        super(name, sex, age);
    }
}
