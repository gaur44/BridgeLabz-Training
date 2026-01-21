package mealplanner;

public class VegetarianMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public int calories() {
        return 600;
    }
}

