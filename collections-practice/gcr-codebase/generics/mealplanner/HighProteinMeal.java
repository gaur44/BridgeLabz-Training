package mealplanner;

public class HighProteinMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "High Protein";
    }

    @Override
    public int calories() {
        return 800;
    }
}

