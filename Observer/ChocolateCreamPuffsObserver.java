public class ChocolateCreamPuffsObserver extends Observer{
    public ChocolateCreamPuffsObserver(Quantity quantity){
        this.quantity = quantity;
        this.quantity.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "\nAmount of Chocolate Cream Puffs: " + quantity.getState() );
    }

    @Override
    public void warning() {
        System.out.println( "\n\tWarning! Low Amount of Chocolate Cream Puffs " + quantity.getState() );
    }
}
