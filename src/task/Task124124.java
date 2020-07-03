package task;

import java.util.Scanner;

public class Task124124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число1: ");
        int n = scanner.nextInt();
        System.out.println("число2");
        int k = scanner.nextByte();
        int m = n % k;
        System.out.println("Ответ - " + m);
    }
}

