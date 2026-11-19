package fr.petit.noe.character.humanoide;

import fr.petit.noe.ability.Worker;
import fr.petit.noe.character.Sex;
import fr.petit.noe.food.Food;

public class Elf extends Humanoid implements Worker {
    public Elf(String name, Sex sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void emitSound() {

    }

    @Override
    public void move() {

    }

    @Override
    public void eat(Food food) {

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
}
