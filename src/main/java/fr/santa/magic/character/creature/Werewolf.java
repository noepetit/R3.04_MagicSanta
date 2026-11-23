package fr.santa.magic.character.creature;

import fr.santa.magic.ability.Fantastic;
import fr.santa.magic.character.Sex;
import fr.santa.magic.food.Food;

public class Werewolf extends Creature implements Fantastic {
    public Werewolf(String name, Sex sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void emitSound() {

    }

    @Override
    public void move() {

    }

    @Override
    public boolean beFantastic() {
        if (!isActive()) {
            return false;
        }else {
            increaseOrDecreaseChristmasMagic(3);
            return true;
        }
    }
}
