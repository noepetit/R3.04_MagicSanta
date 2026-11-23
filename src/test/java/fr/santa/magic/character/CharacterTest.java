package fr.santa.magic.character;

import fr.santa.magic.food.Food;
import fr.santa.magic.food.FoodType;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {

    @Test
    public void testFoodCreation() {
        Food food = new Food(FoodType.SOLID, 3) {};

        assertEquals(FoodType.SOLID, food.getFoodType());
        assertEquals(3.0f, food.getNutritionalValue(), 0.001f);
    }
}