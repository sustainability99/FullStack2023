public class Main {
    public static void main(String[] args) {
        System.out.println("Musik ist die gemeinsame Sprache der Menschheit");

        Musician musician = new Musician("Alexander", "Alexandrov", "Balalajka");
        Jazz jazz = new Jazz("Josef", "Johanson", "Saxophon");
        Classic classic = new Classic("Assic", "Cissalc", "Klavier");
        RockAndRoll rock = new RockAndRoll("Rolling", "Stones", "Gitarre");

        musician.play_music();
        jazz.play_music();
        classic.play_music();
        rock.play_music();

    }
}