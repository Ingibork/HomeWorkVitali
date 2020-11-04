package example;


public class Exeption1 {
    public static void main(String[] args) {
        String name = null;
        try {
            name.length();
        } catch (NullPointerException exception) {
            System.err.println("Catch");
            exception.printStackTrace();
        }
    }
}
