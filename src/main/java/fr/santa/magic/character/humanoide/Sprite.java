package fr.santa.magic.character.humanoide;
 import fr.santa.magic.ability.Fantastic;
 import fr.santa.magic.ability.Playable;
 import fr.santa.magic.ability.Worker;
 import fr.santa.magic.character.Sex;
 import fr.santa.magic.food.Food;

public class Sprite extends Humanoid implements Playable, Fantastic, Worker {
    public Sprite(String name, Sex sex, int age) {
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

    @Override
    public boolean haveFun() {
        if (!isActive()) {
            return false;
        }else {
            increaseOrDecreaseChristmasMagic(3);
            return true;
        }
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
