public class PastryChef {
    PastryChef(){

    }

    private CreamPuff makeCreamPuff(){
        CreamPuff creamPuff = new CreamPuff();
        return creamPuff;
    }

    public Pie makePie(){
        Pie pie = new Pie();
        return pie;
    }

    public Cake makeCreamPuffVanilla(){
        Cake creamPuff = makeCreamPuff();
        Cake creamPuffVanilla = new Vanilla(creamPuff);
        return creamPuffVanilla;
    }

    public Cake makeCreamPuffChocolate(){
        Cake creamPuff = makeCreamPuff();
        Cake creamPuffChocolate= new Chocolate(creamPuff);
        return creamPuffChocolate;
    }

    public Cake makeApplePie(){
        Cake pie = makePie();
        Cake applePie = new Apple(pie);
        return applePie;
    }

    public Cake makeApricotPie(){
        Cake pie = makePie();
        Cake apricotPie = new Apricot(pie);
        return apricotPie;
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
