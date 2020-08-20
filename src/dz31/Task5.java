package dz31;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя...");
        String name = scanner.nextLine();
        String a = "Вася";
        String b = "Анастасия";
        if (name.equals(a)) {
            System.out.print("Привет! \nЯ тебя так долго ждал\n");
        }

        if (name.equals(b)) {
            System.out.println("Я тебя так долго ждал");
        }

        if (!name.equals(a) && !name.equals(b)) {
            System.out.println("Добрый день, а вы кто?");
        }

        }
    }


