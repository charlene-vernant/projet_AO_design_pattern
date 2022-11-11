import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bakery {
    public static void main(String[] args) {
        PastryChef papatissier = new PastryChef();
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
                                CompositeCake creamPuffVanilla = papatissier.makeCreamPuffVanilla();
                                CompositeCake finalVanillaPuff = choiceToppingCreamPuff(creamPuffVanilla, papatissier);
                                System.out.println("Here is your " + finalVanillaPuff.toString() + "\n");
                                choiceTaste = 0;
                                break;
                            case 2:
                                CompositeCake creamPuffChocolate = papatissier.makeCreamPuffChocolate();
                                CompositeCake finalChocolatePuff = choiceToppingCreamPuff(creamPuffChocolate, papatissier);
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
                                CompositeCake applePie = papatissier.makeApplePie();
                                CompositeCake finalApplePie = choiceToppingPie(applePie, papatissier);
                                System.out.println("Here is your " + finalApplePie.toString() + "\n");
                                choiceTaste = 0;
                                break;
                            case 2:
                                CompositeCake apricotPie = papatissier.makeApricotPie();
                                CompositeCake finalApricotPie = choiceToppingPie(apricotPie, papatissier);
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
    public static CompositeCake choiceToppingCreamPuff(CompositeCake creamPuff, PastryChef pastryChef){
        int Topping = 1;
        while (Topping != 0) {
            System.out.println("\nwhich topping?\n0\tNone\n1\tWhipped Cream\n2\tHazelnuts\n3\tGrilled almonds");
            Topping = saisieEntier();
            switch (Topping) {
                case 1 :
                    return pastryChef.addWhippedCream(creamPuff);
                case 2:
                    return pastryChef.addHazelnut(creamPuff);
                case 3:
                    return pastryChef.addAlmonds(creamPuff);
                default:
                    break;
            }
        }
        return creamPuff;
    }

    public static CompositeCake choiceToppingPie(CompositeCake pie, PastryChef pastryChef){
        int Topping = 1;
        while (Topping != 0) {
            System.out.println("\nwhich topping?\n0\tNone\n1\tMeringue\n2\tHazelnuts\n3\tGrilled almonds");
            Topping = saisieEntier();
            switch (Topping) {
                case 1 :
                    return pastryChef.addMeringue(pie);
                case 2:
                    return pastryChef.addHazelnut(pie);
                case 3:
                    return pastryChef.addAlmonds(pie);
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
            return Integer.parseInt(chaine);
        } catch (IOException e) {
            return 0;
        }
    }

    public static String saisieChaine () {
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            return buff.readLine();
        } catch (IOException e) {
            System.out.println(" impossible de travailler" + e);
            return null;
        }
    }
}