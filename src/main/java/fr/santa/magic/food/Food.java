package fr.santa.magic.food;

public abstract class Food {
    private final FoodType foodType;
    private final int nutritionalValue;

    public Food(FoodType foodType, int nutritionalValue) {
        this.foodType = foodType;
        this.nutritionalValue = nutritionalValue;
    }

    public FoodType getFoodType() {
        return this.foodType;
    }

    public int getNutritionalValue() {
        return this.nutritionalValue;
    }
}
