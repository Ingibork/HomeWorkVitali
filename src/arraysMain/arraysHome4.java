package arraysMain;

import java.util.Scanner;

/**
 * 2.1 Вывести все элементы в консоль при помощи do....while, while, for, foreach.
 * Элементы массива вводить через консоль. Массив хранит в себе числа.
 */
public class arraysHome4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива - ");
        for (int i : array) {
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Элементы массива -");
        for (int a : array) {
            System.out.print(a);
            a++;
        }


    }
}
