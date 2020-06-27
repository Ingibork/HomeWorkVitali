package task;

import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя...");
        String name = scanner.nextLine();
        String a = "Вася";
        String b = "Анастасия";

        if (name.equals(a)) {
            System.out.print("Привет! \nЯ тебя так долго ждал\n");
        } else if (name.equals(b))
            System.out.println("Я тебя так долго ждал");

        else System.out.println("Добрый день, а вы кто?");
    }
}
