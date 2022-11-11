public class ApricotPieObserver extends Observer{
    public ApricotPieObserver(Quantity quantity){
        this.quantity = quantity;
        this.quantity.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "\nAmount of Apricot Pie: " + quantity.getState() );
    }

    @Override
    public void warning() {
        System.out.println( "\n\tWarning! Low Amount of Apricot Pie " + quantity.getState() );
    }
}
