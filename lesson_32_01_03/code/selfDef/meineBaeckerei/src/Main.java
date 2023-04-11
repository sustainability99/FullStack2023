public class Main {
    public static void main(String[] args) {
        System.out.println("Willkommen in unserer Backstube, was möchten Sie gern speisen? ");

        enum baecker {
            PainAuChocolat,
            Croissant,
            Baquette,
            Macaron,
            Brötchen,

            }
        baecker mySpezial = baecker.PainAuChocolat;

        switch (mySpezial) {

            case PainAuChocolat -> {
                System.out.println("Pain au chocolat wird in Frankreich ein Gebäck bezeichnet.");
                System.out.println("Der mit schokolade befüllt ist.");
                break;
            }
                case Croissant -> {
                    System.out.println("Croissants sind beliebte Frühstücksgebäcke");
                    break;
                }
                case Baquette -> {
                    System.out.println("***la baguette*** ist ein langgestrecktes, knuspriges Weißbrot ");
                    System.out.println("französischen Ursprungs.");
                    break;
                }
                case Macaron -> {
                    System.out.println("Die Macaron ist ein französisches Baisergebäck aus Mandelmehl");
                    break;

                }case Brötchen -> {
                System.out.println("Brötchen ist ein Sammelbegriff für meist ungesüßte kleine Gebäcke");
                break;
            }
        }
    }
}

