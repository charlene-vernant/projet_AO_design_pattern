abstract class CakeBuilder{
    protected Cake cake;
    public Cake getCake()
    {
        return cake;
    }
    public void createNewCake()
    {
        cake = new Cake();
    }
    public abstract void buildCakeType();
    public abstract void buildFlavor();
}