package fr.santa.magic.character;

import fr.santa.magic.food.Food;

public abstract class Character {
    private static final int MAGIC_MIN = 0;
    private static final int MAGIC_DEFAULT = 100;
    private static final int MAGIC_MAX = 100;

    private static final int FOOD_MIN = 0;
    private static final int FOOD_DEFAULT = 80;
    private static final int FOOD_MAX = 100;

    private static final int ENERGY_MIN = 0;
    private static final int ENERGY_DEFAULT = 80;
    private static final int ENERGY_MAX = 100;

    private String name;
    private Sex sex;
    private int age;
    private float foodBar;
    private float energyBar;
    private boolean active;
    private float christmasMagic;

    public Character(String name, Sex sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.foodBar = FOOD_DEFAULT;
        this.energyBar = ENERGY_DEFAULT;
        this.active = true;
        this.christmasMagic = MAGIC_DEFAULT;
    }

    public abstract void emitSound();
    public abstract void move();

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public float getFoodBar() {
        return foodBar;
    }

    public float getEnergyBar() {
        return energyBar;
    }

    public float getChristmasMagic() {
        return christmasMagic;
    }

    public boolean isActive() {
        return this.active;
    }

    public void eat(Food food) {
        if (this.active) {
            foodBar += food.getNutritionalValue();
        }
    }

    public void restOrGetActive(boolean newState) {
        this.active = newState;
    }

    public void increaseOrDecreaseChristmasMagic(float amount) {
        this.christmasMagic += amount;
        this.christmasMagic = Math.clamp(this.christmasMagic, MAGIC_MIN, MAGIC_MAX );
    }

    protected boolean beFantastic() {
        if (!isActive()) {
            return false;
        }else {
            increaseOrDecreaseChristmasMagic(3);
            return true;
        }
    }
}
