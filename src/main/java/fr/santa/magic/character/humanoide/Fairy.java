package fr.santa.magic.character.humanoide;

import fr.santa.magic.ability.Fantastic;
import fr.santa.magic.ability.Worker;
import fr.santa.magic.character.Sex;
import fr.santa.magic.food.Food;

public class Fairy extends Humanoid implements Worker, Fantastic {
    public Fairy(String name, Sex sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void emitSound() {

    }

    @Override
    public void move() {

    }

    @Override
    public boolean work() {
        if (!isActive()) {
            return false;
        }else {
            increaseOrDecreaseChristmasMagic(3);
            return true;
        }
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
