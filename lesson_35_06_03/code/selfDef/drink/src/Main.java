public class Main {
    public static void main(String[] args) {
        System.out.println("Eine Auswahl an Getränken: ");

        Wine myWine = new Wine();
          myWine.name = "Domaine Leroy Musigny Grand Cru";
          myWine.sort = "red";
          myWine.year = 1929;

          System.out.println(myWine);
          System.out.println(myWine.onStock(10));
          System.out.println(myWine.getYear());

        Wine exclusivWine = new Wine();
          myWine.name = "Egon Muller Scharzhofberger Riesling";
          myWine.sort = "white";
          myWine.year = 2011;

          System.out.println(myWine);
          System.out.println(myWine.onStock(18));
          System.out.println(myWine.getYear());

        Wine whiteWine = new Wine();
          myWine.name = "Leroy Domaine d'Auvenay Chevalier-Montrachet";
          myWine.sort = "white";
          myWine.year = 2005;

          System.out.println(myWine);
          System.out.println(myWine.onStock(8));
          System.out.println(myWine.getYear());
    }

}