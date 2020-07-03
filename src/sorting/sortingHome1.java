package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Выполнить сортировку массива с числами. Алгоритм пузырёк.
 * Заполнять массив нужно через консоль в первом случае и предварительно
 * созданным  созданным во втором случае.
 * 1
 */
public class sortingHome1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

