package fr.santa.magic.food;

public abstract class Food {
    private final FoodType foodType;
    private final float nutritionalValue;

    public Food(FoodType foodType, float nutritionalValue) {
        this.foodType = foodType;
        this.nutritionalValue = nutritionalValue;
    }

    public FoodType getFoodType() {
        return this.foodType;
    }

    public float getNutritionalValue() {
        return this.nutritionalValue;
    }
}
