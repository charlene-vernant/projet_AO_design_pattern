public class Apricot extends IngredientDecorator{

    public Apricot(Cake newCake) {
        super(newCake);
    }

    @Override
    public String toString() {
        return "Apricot" + super.toString();
    }
}
