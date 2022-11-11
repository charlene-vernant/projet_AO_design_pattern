public class Chocolate extends IngredientDecorator {
    public Chocolate(Cake newCake) {
        super(newCake);
    }

    @Override
    public String toString() {
        return "Chocolate " + super.toString();
    }
}
