abstract class IngredientDecorator extends Cake {
    protected Cake cake;

    public IngredientDecorator(Cake newCake){
        cake = newCake;
    }

    public String toString() {
        return cake.toString();
    }
}
