package fr.santa.magic.character.humanoide;


import fr.santa.magic.ability.HaveFun;
import fr.santa.magic.character.Sex;

public class Visitor extends Humanoid implements HaveFun {
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
    public boolean haveFun() {
        if (!isActive()) {
            return false;
        }else {
            increaseOrDecreaseChristmasMagic(3);
            return true;
        }
    }
}
