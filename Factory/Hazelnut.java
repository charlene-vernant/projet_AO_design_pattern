public class Hazelnut extends IngredientDecorator {

    public Hazelnut(Cake newCake) {
        super(newCake);
    }

    @Override
    public String toString() {
        return super.toString() + " with Hazelnuts";
    }
}
