public class Almonds extends IngredientDecorator{

    public Almonds(Cake newCake) {
        super(newCake);
    }

    @Override
    public String toString() {
        return super.toString() + " with grilled Almonds";
    }
}
