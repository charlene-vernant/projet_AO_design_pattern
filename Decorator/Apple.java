public class Apple extends IngredientDecorator{

    public Apple(Cake newCake) {
        super(newCake);
    }

    @Override
    public String toString() {
        return "Apple" + super.toString();
    }
}
