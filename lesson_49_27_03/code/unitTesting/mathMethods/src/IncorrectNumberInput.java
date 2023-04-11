public class IncorrectNumberInput extends Exception {
    @Override
    public String getMessage() {
        // return super.getMessage();
        String s = "-1, 0, 1 - are not a prime numbers";
        return s;
    }
}