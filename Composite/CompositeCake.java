import java.util.ArrayList;
import java.util.List;

public class CompositeCake extends Ingredient {
    private List<Ingredient> ingredientList = new ArrayList<Ingredient>();

    public void add(Ingredient ingredient) {
        ingredientList.add(ingredient);
    }

    @Override
    public String toString() {
        String finalDescription = "";
        for (Ingredient ingredient : ingredientList) {
            finalDescription += ingredient.toString();
        }
        return finalDescription;
    }
}