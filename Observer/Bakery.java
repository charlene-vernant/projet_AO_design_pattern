import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bakery {
    public static void main(String[] args) {

        //Creation of the pastry Chef and the four type of cake and their amount
        PastryChefDirector pastryChefDirector = new PastryChefDirector();
        Quantity quantityApplePie = new Quantity();
        Quantity quantityApricotPie = new Quantity();
        Quantity quantityVanillaCreamPuffs = new Quantity();
        Quantity quantityChocolateCreamPuffs = new Quantity();

        Cake creamPuffVanilla = null;
        Cake creamPuffChocolate = null;
        Cake applePie = null;
        Cake apricotPie = null;

        //Creation of Observers for each amount of cake
        ApplePieObserver applePieObserver = new ApplePieObserver(quantityApplePie);
        ApricotPieObserver apricotPieObserver = new ApricotPieObserver(quantityApricotPie);
        VanillaCreamPuffsObserver vanillaCreamPuffsObserver = new VanillaCreamPuffsObserver(quantityVanillaCreamPuffs);
        ChocolateCreamPuffsObserver chocolateCreamPuffsObserver = new ChocolateCreamPuffsObserver(quantityChocolateCreamPuffs);

        System.out.println("\nBefore the opening of the bakery... \n\tThe pastry chef prepares the cakes...\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("First Batch");
            //Cooking Vanilla Cream Puffs
            CakeBuilder VanillaCreamPuffs = new VanillaCreamPuffs();
            pastryChefDirector.setCakeBuilder(VanillaCreamPuffs);
            pastryChefDirector.constructCake();
            creamPuffVanilla = pastryChefDirector.getCake();
            quantityVanillaCreamPuffs.setState(quantityVanillaCreamPuffs.getState()+1);

            //Cooking Chocolate Cream Puffs
            CakeBuilder chocolateCreamPuffsBuilder = new ChocolateCreamPuffs();
            pastryChefDirector.setCakeBuilder(chocolateCreamPuffsBuilder);
            pastryChefDirector.constructCake();
            creamPuffChocolate = pastryChefDirector.getCake();
            quantityChocolateCreamPuffs.setState(quantityChocolateCreamPuffs.getState()+1);

            //Cooking Apple Pie
            CakeBuilder applePieBuilder = new ApplePie();
            pastryChefDirector.setCakeBuilder( applePieBuilder );
            pastryChefDirector.constructCake();
            applePie = pastryChefDirector.getCake();
            quantityApplePie.setState(quantityApplePie.getState()+1);

            //Cooking Apricot Pie
            CakeBuilder apricotPieBuilder = new ApricotPie();
            pastryChefDirector.setCakeBuilder( apricotPieBuilder );
            pastryChefDirector.constructCake();
            apricotPie = pastryChefDirector.getCake();
            quantityApricotPie.setState(quantityApricotPie.getState()+1);

        }

        System.out.println("\nNow it is time to open the Bakery...");
        System.out.println("\n...");
        System.out.println("\n...");


        System.out.println("\nWelcome to our bakery! ");
        int rep = 1;
        while (rep != 0) {
            System.out.println("How may I help you?\n0\tQuitter\n1\tI want a Cream Puff\n2\tI want a Pie");
            rep = saisieEntier();
            switch (rep) {
                case 0:
                    System.out.println("Thank you, we hope to see you soon!");
                    System.exit(0);
                    break;
                case 1:
                    int choiceTaste = 1;
                    while (choiceTaste != 0) {
                        System.out.println("\nwhich taste?\n0\tCancel\n1\tVanilla\n2\tChocolate");
                        choiceTaste = saisieEntier();
                        switch (choiceTaste) {
                            case 1 :
                                Cake finalVanillaPuff = choiceToppingCreamPuff(creamPuffVanilla, pastryChefDirector);
                                System.out.println("Here is your " + finalVanillaPuff.toString() + "\n");
                                quantityVanillaCreamPuffs.setState(quantityVanillaCreamPuffs.getState()-1);
                                choiceTaste = 0;
                                break;
                            case 2 :
                                Cake finalChocolatePuff = choiceToppingCreamPuff(creamPuffChocolate, pastryChefDirector);
                                System.out.println("Here is your " + finalChocolatePuff.toString() + "\n");
                                quantityChocolateCreamPuffs.setState(quantityChocolateCreamPuffs.getState()-1);
                                choiceTaste = 0;
                                break;
                            default :
                                break;
                        }
                    }
                    break;
                case 2:
                    choiceTaste = 1;
                    while (choiceTaste != 0) {
                        System.out.println("\nwhich taste?\n0\tCancel\n1\tApple\n2\tApricot");
                        choiceTaste = saisieEntier();
                        switch (choiceTaste) {
                            case 1:
                                Cake finalApplePie = choiceToppingCreamPuff(applePie, pastryChefDirector);
                                System.out.println("Here is your " + finalApplePie.toString() + "\n");
                                choiceTaste = 0;
                                quantityApplePie.setState(quantityApplePie.getState()-1);
                                break;
                            case 2:
                                Cake finalApricotPie = choiceToppingPie(apricotPie, pastryChefDirector);
                                System.out.println("Here is your " + finalApricotPie.toString() + "\n");
                                choiceTaste = 0;
                                quantityApricotPie.setState(quantityApricotPie.getState()-1);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
    public static Cake choiceToppingCreamPuff(Cake creamPuff, PastryChefDirector pastryChefDirector){
        int Topping = 1;
        while (Topping != 0) {
            System.out.println("\nwhich topping?\n0\tNone\n1\tWhipped Cream\n2\tHazelnuts\n3\tGrilled almonds");
            Topping = saisieEntier();
            switch (Topping) {
                case 1 :
                    return pastryChefDirector.addWhippedCream(creamPuff);
                case 2:
                    return pastryChefDirector.addHazelnut(creamPuff);
                case 3:
                    return pastryChefDirector.addAlmonds(creamPuff);
                default:
                    break;
            }
        }
        return creamPuff;
    }

    public static Cake choiceToppingPie(Cake pie, PastryChefDirector pastryChefDirector){
        int Topping = 1;
        while (Topping != 0) {
            System.out.println("\nwhich topping?\n0\tNone\n1\tMeringue\n2\tHazelnuts\n3\tGrilled almonds");
            Topping = saisieEntier();
            switch (Topping) {
                case 1 :
                    Cake pieMeringue = pastryChefDirector.addMeringue(pie);
                    return pieMeringue;
                case 2:
                    Cake pieHazelnut = pastryChefDirector.addHazelnut(pie);
                    return pieHazelnut;
                case 3:
                    Cake pieAlmonds = pastryChefDirector.addAlmonds(pie);
                    return pieAlmonds;
                default:
                    break;
            }
        }
        return pie;
    }
    public static int saisieEntier() {
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            String chaine = buff.readLine();
            int num = Integer.parseInt(chaine);
            return num;
        } catch (IOException e) {
            return 0;
        }
    }

    public static String saisieChaine () {
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            String chaine = buff.readLine();
            return chaine;
        } catch (IOException e) {
            System.out.println(" impossible de travailler" + e);
            return null;
        }
    }
}
