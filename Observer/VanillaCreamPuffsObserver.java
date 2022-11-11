public class VanillaCreamPuffsObserver extends Observer{
    public VanillaCreamPuffsObserver(Quantity quantity){
        this.quantity = quantity;
        this.quantity.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "\nAmount of Vanilla Cream Puffs: " + quantity.getState() );
    }

    @Override
    public void warning() {
        System.out.println( "\n\tWarning! Low Amount of Vanilla Cream Puffs " + quantity.getState() );
    }
}
