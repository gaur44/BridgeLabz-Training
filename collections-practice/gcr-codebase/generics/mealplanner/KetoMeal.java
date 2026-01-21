package mealplanner;

public class KetoMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public int calories() {
        return 700;
    }
}

