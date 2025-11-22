package generic_assignment;

interface MealPlan {
    String name();
}

class VegetarianMeal implements MealPlan {
    public String name() { return "Vegetarian"; }
}

class VeganMeal implements MealPlan {
    public String name() { return "Vegan"; }
}

class KetoMeal implements MealPlan {
    public String name() { return "Keto"; }
}

class HighProteinMeal implements MealPlan {
    public String name() { return "High Protein"; }
}

class Meal<T extends MealPlan> {
    private T plan;
    Meal(T plan) { this.plan = plan; }
    T getPlan() { return plan; }
    public String toString() { return plan.name(); }
}

class MealPlanSystem {

    public static <T extends MealPlan> T generate(T plan) {
        return plan;
    }

    public static void main(String[] args) {
        Meal<VeganMeal> m1 = new Meal<>(new VeganMeal());
        Meal<KetoMeal> m2 = new Meal<>(new KetoMeal());
        Meal<VegetarianMeal> m3 = new Meal<>(new VegetarianMeal());

        System.out.println(generate(m1.getPlan()).name());
        System.out.println(generate(m2.getPlan()).name());
        System.out.println(generate(m3.getPlan()).name());
    }
}