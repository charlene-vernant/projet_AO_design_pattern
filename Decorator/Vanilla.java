public class Vanilla extends IngredientDecorator {
    public Vanilla(Cake newCake) {
        super(newCake);
    }

    @Override
    public String toString() {
        return "Vanilla " + super.toString();
    }
}
