import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bakery {
    public static void main(String[] args) {
        PastryChefDirector pastryChefDirector = new PastryChefDirector();
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
                            case 1:
                                CakeBuilder VanillaCreamPuffs = new VanillaCreamPuffs();
                                pastryChefDirector.setCakeBuilder( VanillaCreamPuffs );
                                pastryChefDirector.constructCake();
                                Cake creamPuffVanilla = pastryChefDirector.getCake();
                                Cake finalVanillaPuff = choiceToppingCreamPuff(creamPuffVanilla, pastryChefDirector);
                                System.out.println("Here is your " + finalVanillaPuff.toString() + "\n");
                                choiceTaste = 0;
                                break;
                            case 2:
                                CakeBuilder chocolateCreamPuffsBuilder = new ChocolateCreamPuffs();
                                pastryChefDirector.setCakeBuilder( chocolateCreamPuffsBuilder );
                                pastryChefDirector.constructCake();
                                Cake creamPuffChocolate = pastryChefDirector.getCake();
                                Cake finalChocolatePuff = choiceToppingCreamPuff(creamPuffChocolate, pastryChefDirector);
                                System.out.println("Here is your " + finalChocolatePuff.toString() + "\n");
                                choiceTaste = 0;
                                break;
                            default:
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
                                CakeBuilder applePieBuilder = new ApplePie();
                                pastryChefDirector.setCakeBuilder( applePieBuilder );
                                pastryChefDirector.constructCake();
                                Cake applePie = pastryChefDirector.getCake();
                                Cake finalApplePie = choiceToppingCreamPuff(applePie, pastryChefDirector);
                                System.out.println("Here is your " + finalApplePie.toString() + "\n");
                                choiceTaste = 0;
                                break;
                            case 2:
                                CakeBuilder apricotPieBuilder = new ApricotPie();
                                pastryChefDirector.setCakeBuilder( apricotPieBuilder );
                                pastryChefDirector.constructCake();
                                Cake apricotPie = pastryChefDirector.getCake();
                                Cake finalApricotPie = choiceToppingPie(apricotPie, pastryChefDirector);
                                System.out.println("Here is your " + finalApricotPie.toString() + "\n");
                                choiceTaste = 0;
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
                    Cake creamPuffWhippedCream = pastryChefDirector.addWhippedCream(creamPuff);
                    return creamPuffWhippedCream;
                case 2:
                    Cake creamPuffHazelnut = pastryChefDirector.addHazelnut(creamPuff);
                    return creamPuffHazelnut;
                case 3:
                    Cake creamPuffAlmonds = pastryChefDirector.addAlmonds(creamPuff);
                    return creamPuffAlmonds;
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