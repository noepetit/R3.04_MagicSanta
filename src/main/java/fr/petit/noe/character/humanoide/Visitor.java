package fr.petit.noe.character.humanoide;


import fr.petit.noe.ability.Playable;
import fr.petit.noe.character.Sex;
import fr.petit.noe.food.Food;

public class Visitor extends Humanoid implements Playable {
    public Visitor(String name, Sex sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void increaseOrDecreaseChristmasMagic(float amount) {
        super.increaseOrDecreaseChristmasMagic(amount);
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
    public boolean haveFun() {
        if (!isActive()) {
            return false;
        }else {
            increaseOrDecreaseChristmasMagic(3);
            return true;
        }
    }
}
