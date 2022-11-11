public class PastryChefDirector {
    private CakeBuilder cakeBuilder;
    public void setCakeBuilder(CakeBuilder cakeBuilder)
    {
        this.cakeBuilder = cakeBuilder;
    }
    public Cake getCake()
    {
        return cakeBuilder.getCake();
    }
    public void constructCake()
    {
        cakeBuilder.createNewCake();
        cakeBuilder.buildCakeType();
        cakeBuilder.buildFlavor();
    }
    public Cake addMeringue(Cake cake){
        Cake cakeMeringue = new Meringue(cake);
        return cakeMeringue;
    }

    public Cake addHazelnut(Cake cake){
        Cake cakeHazelnut = new Hazelnut(cake);
        return cakeHazelnut;
    }

    public Cake addWhippedCream(Cake cake){
        Cake cakeWhippedCream = new WhippedCream(cake);
        return cakeWhippedCream;
    }

    public Cake addAlmonds(Cake cake){
        Cake cakeAlmonds = new Almonds(cake);
        return cakeAlmonds;
    }
}
