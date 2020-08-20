package dz31.sorting;

import java.util.Arrays;

/**
 * Выполнить сортировку массива с числами. Алгоритм пузырёк.
 * Заполнять массив нужно через консоль в первом случае и предварительно
 * созданным  созданным во втором случае.
 * 2
 */
public class sortingHome2 {
    public static void main(String[] args) {

        int[] array = {8, 8, 0, 0, 5, 5, 5, 3, 5, 3, 5};
        for (int i = 0; i < array.length; i++) {
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

