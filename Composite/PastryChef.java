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

    public CompositeCake makeCreamPuffVanilla(){
        Ingredient creamPuff = makeCreamPuff();
        Ingredient vanilla = new Vanilla();

        CompositeCake vanillaCreamPuffs = new CompositeCake();
        vanillaCreamPuffs.add(vanilla);
        vanillaCreamPuffs.add(creamPuff);
        return vanillaCreamPuffs;
    }

    public CompositeCake makeCreamPuffChocolate(){
        Ingredient creamPuff = makeCreamPuff();
        Ingredient chocolate = new Chocolate();

        CompositeCake chocolateCreamPuffs = new CompositeCake();
        chocolateCreamPuffs.add(chocolate);
        chocolateCreamPuffs.add(creamPuff);
        return chocolateCreamPuffs;
    }

    public CompositeCake makeApplePie(){
        Ingredient pie = makePie();
        Ingredient apple = new Apple();

        CompositeCake applePie = new CompositeCake();
        applePie.add(apple);
        applePie.add(pie);
        return applePie;
    }

    public CompositeCake makeApricotPie(){
        Ingredient pie = makePie();
        Ingredient apricot = new Apricot();

        CompositeCake apricotPie = new CompositeCake();
        apricotPie.add(apricot);
        apricotPie.add(pie);
        return apricotPie;
    }

    public CompositeCake addMeringue(CompositeCake compositeCake){
        Ingredient meringue = new Meringue();
        compositeCake.add(meringue);
        return compositeCake;
    }

    public CompositeCake addHazelnut(CompositeCake compositeCake){
        Ingredient hazelnut = new Hazelnut();
        compositeCake.add(hazelnut);
        return compositeCake;
    }

    public CompositeCake addWhippedCream(CompositeCake compositeCake){
        Ingredient whippedCream = new WhippedCream();
        compositeCake.add(whippedCream);
        return compositeCake;
    }

    public CompositeCake addAlmonds(CompositeCake compositeCake){
        Ingredient almonds = new Almonds();
        compositeCake.add(almonds);
        return compositeCake;
    }
}
