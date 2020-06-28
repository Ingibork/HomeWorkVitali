package task;

import java.util.Scanner;

/**
 * Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем
 * возводить, Второе число это степень в которую возводят первое число
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println("Введите степень в которую его возвести");
        int b = scanner.nextInt();
        System.out.println(Math.pow(a, b));
    }
}
