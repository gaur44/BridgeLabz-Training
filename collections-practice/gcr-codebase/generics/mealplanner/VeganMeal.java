package mealplanner;

public class VeganMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public int calories() {
        return 500;
    }
}

