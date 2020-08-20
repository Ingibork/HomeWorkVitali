package dz32;

import java.util.Scanner;

/**
 * 2.1 Вывести все элементы в консоль при помощи do....while, while, for, foreach.
 * Элементы массива вводить через консоль. Массив хранит в себе числа.
 */
public class arraysHome3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: - ");
        int size = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        int array[] = new int[size];
        int a = 0;
        do {
            array[a] = scanner.nextInt();
            a++;
        } while (a < size);
        int b = 0;
        System.out.print("Элементы массива - ");
        do {
            System.out.print(array[b] + " ");
            b++;
        } while (b < size);
    }
}
