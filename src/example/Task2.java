package example;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(coutUnique(integers));

    }

    private static int coutUnique (List<Integer> list) {
        Set<Integer> integers = new HashSet<>(list);
        return integers.size();
    }

}
