package mealplanner;

public class Main {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                MealUtils.generateMeal(new VegetarianMeal());

        Meal<KetoMeal> ketoMeal =
                MealUtils.generateMeal(new KetoMeal());

        Meal<VeganMeal> veganMeal =
                MealUtils.generateMeal(new VeganMeal());

        System.out.println(vegMeal.getMealPlan().getMealType()
                + " (" + vegMeal.getMealPlan().calories() + " cal)");

        System.out.println(ketoMeal.getMealPlan().getMealType()
                + " (" + ketoMeal.getMealPlan().calories() + " cal)");

        System.out.println(veganMeal.getMealPlan().getMealType()
                + " (" + veganMeal.getMealPlan().calories() + " cal)");
    }
}

