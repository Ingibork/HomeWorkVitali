package arraysMain;

import java.util.Arrays;

/**
 * 1. По заданному массиву найдите число, которое встречается нечетное количество раз
 * (Всегда будет только одно число, которое встречается нечетное количество раз)
 * <p>
 * 1.1. {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}
 * 1.2. {1,1,2,-2,5,2,4,4,-1,-2,5}
 * 1.3. {20,1,1,2,2,3,3,5,5,4,20,4,5}
 * 1.4. {10}
 * 1.5. {1,1,1,1,1,1,10,1,1,1,1}
 * 1.6. {5,4,3,2,1,5,4,3,2,10,10}
 */
public class arraysHome1_08062020 {
    public static void main(String[] args) {
        int[] array = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    temp++;
                }
            }
            if (temp % 2 != 0) {
                System.out.println(array[i]);
                break;
            }
        }
    }
}



