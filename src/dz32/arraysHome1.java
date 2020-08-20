package dz32;
import java.util.Scanner;
/**
 *  2.1 Вывести все элементы в консоль при помощи do....while, while, for, foreach.
 *  Элементы массива вводить через консоль. Массив хранит в себе числа.
 */
public class arraysHome1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: - ");
        int size = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Элементы массива:");

        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
