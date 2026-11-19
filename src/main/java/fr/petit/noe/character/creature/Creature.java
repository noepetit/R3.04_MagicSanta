package fr.petit.noe.character.creature;
import fr.petit.noe.character.Character;
import fr.petit.noe.character.Sex;
import fr.petit.noe.food.Food;

public abstract class Creature extends Character {
    public Creature(String name, Sex sex, int age) {
        super(name, sex, age);
    }
}

