public class Musician {
    String firstName;
    String lastName;
    String musicalInstrument;

    public Musician(String firstName, String lastName, String musicalInstrument) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.musicalInstrument = musicalInstrument;
    }
    public void play_music() {
        System.out.println("Musik macht glücklich.");
        System.out.println("Besonders wenn es gespielt wird auf " + "***" +  musicalInstrument + "***");
    }
}
