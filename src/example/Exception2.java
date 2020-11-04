package example;

import java.util.ArrayList;

public class Exeption2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3);
        try {
            list.get(3);
        } catch (IndexOutOfBoundsException exception) {
            System.err.println("catch");
            exception.printStackTrace();
        }


    }
}
