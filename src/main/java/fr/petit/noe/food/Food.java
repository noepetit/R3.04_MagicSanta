package fr.petit.noe.food;

public abstract class Food {
    private final FoodType foodType;
    private final int nutritionalValue;

    public Food(FoodType foodType, int nutritionalValue) {
        this.foodType = foodType;
        this.nutritionalValue = nutritionalValue;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public int getNutritionalValue() {
        return nutritionalValue;
    }
}
