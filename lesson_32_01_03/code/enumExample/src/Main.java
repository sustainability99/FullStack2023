public class Main {
    public static void main(String[] args) {
        System.out.println("Beispiel mit enum an vier Jahreszeiten ");

        enum seasons {
            winter,
            spring,
            summer,
            autumn,

        }
        seasons mySeasons = seasons.summer;

        switch (mySeasons) {

            case spring -> {
                System.out.println("Im Frühling scheint die Sonne");
                System.out.println("Alle sollen die Eier färben - Die Hasen verteilen diese");
                break;
            }
            case summer -> {
                System.out.println("Planen unseren Urlaub");
                break;
            }
            case autumn -> {
                System.out.println("Nehmen Regenschirm mit");
                System.out.println("Sammeln Pilze");
                break;
            }
            case winter -> {
                System.out.println("Ziehen Walenki an");
                break;
            }
        }
    }
}