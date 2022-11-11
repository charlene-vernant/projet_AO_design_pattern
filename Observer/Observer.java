public abstract class Observer {
    protected Quantity quantity;

    public abstract void update();
    public abstract void warning();
}