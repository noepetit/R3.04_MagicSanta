package fr.petit.noe.character.humanoide;

import fr.petit.noe.character.Character;
import fr.petit.noe.character.Sex;
import fr.petit.noe.food.Food;

public abstract class Humanoid extends Character {
    public Humanoid(String name, Sex sex, int age) {
        super(name, sex, age);
    }
}
