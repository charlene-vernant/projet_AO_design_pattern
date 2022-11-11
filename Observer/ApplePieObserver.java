public class ApplePieObserver extends Observer{

    public ApplePieObserver(Quantity quantity){
        this.quantity = quantity;
        this.quantity.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "\nAmount of Apple Pie: " + quantity.getState() );
    }

    @Override
    public void warning() {
        System.out.println( "\n\tWarning! Low Amount of Apple Pie " + quantity.getState() );
    }
}