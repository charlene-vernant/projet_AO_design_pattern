public class Meringue extends IngredientDecorator{

    public Meringue(Cake newCake) {
        super(newCake);
    }

    @Override
    public String toString() {
        return super.toString() + " with Meringue";
    }
}
