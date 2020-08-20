package enums;

import java.util.Scanner;

public class EnumsMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название цвета");
        String nameColor = scan.nextLine();

        Color selectedColor = Color.valueOfIgnoreCase(nameColor);


        System.out.println(selectedColor.getId());
        System.out.println(selectedColor.getRusName());
    }
}
