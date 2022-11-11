public class PastryChef {

    public Cake makeCreamPuffVanilla() {
        CakeFactory vanillaCreamPuffsFactory = new VanillaCreamPuffsFactory();
        Cake creamPuffVanilla = vanillaCreamPuffsFactory.createCake();
        return creamPuffVanilla;
    }

    public Cake makeCreamPuffChocolate() {
        CakeFactory chocolateCreamPuffsFactory = new ChocolateCreamPuffsFactory();
        Cake creamPuffChocolate = chocolateCreamPuffsFactory.createCake();
        return creamPuffChocolate;
    }

    public Cake makeApplePie() {
        CakeFactory applePieFactory = new ApplePieFactory();
        Cake applePie = applePieFactory.createCake();
        return applePie;
    }

    public Cake makeApricotPie() {
        CakeFactory apricotPieFactory = new ApricotPieFactory();
        Cake apricotPie = apricotPieFactory.createCake();
        return apricotPie;
    }

    public Cake addMeringue(Cake cake) {
        Cake cakeMeringue = new Meringue(cake);
        return cakeMeringue;
    }

    public Cake addHazelnut(Cake cake) {
        Cake cakeHazelnut = new Hazelnut(cake);
        return cakeHazelnut;
    }

    public Cake addWhippedCream(Cake cake) {
        Cake cakeWhippedCream = new WhippedCream(cake);
        return cakeWhippedCream;
    }

    public Cake addAlmonds(Cake cake) {
        Cake cakeAlmonds = new Almonds(cake);
        return cakeAlmonds;
    }
}