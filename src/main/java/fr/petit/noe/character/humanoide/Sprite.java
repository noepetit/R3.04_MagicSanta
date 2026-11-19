package fr.petit.noe.character.humanoide;
 import fr.petit.noe.ability.Fantastic;
 import fr.petit.noe.ability.Playable;
 import fr.petit.noe.ability.Worker;
 import fr.petit.noe.character.Character;
 import fr.petit.noe.character.Sex;
 import fr.petit.noe.food.Food;

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
    public void eat(Food food) {

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
