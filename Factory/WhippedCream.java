public class WhippedCream extends IngredientDecorator {

    public WhippedCream(Cake newCake) {
        super(newCake);
    }

    @Override
    public String toString() {
        return super.toString() + " with sweet Whipped Cream";
    }
}
