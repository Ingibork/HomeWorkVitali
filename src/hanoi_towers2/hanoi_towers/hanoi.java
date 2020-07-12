package hanoi_towers2.hanoi_towers;

import java.util.Scanner;

/**
 * 1. Дать возможность указать количество колец, минимальное 3
 * 2. Есть два режима игры:
 * 2.1 Ручной. В данном режиме пользователь указывает какой элемент и куда он передвигает
 * 2.2* Автоматический. Пользователь наблюдает за каждым шагом самостоятельной игры компьютера
 * 3. Стартовое поле выглядит следующим образом:
 * 1**
 * 2**
 * 3**
 * Где цифра - это кольцо определённого размера, * - это пустое место на стержне
 */
public class hanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество колец: - ");
        int size = scanner.nextInt();
        int[][] tower = new int[size][size];

        int k = 1;
        for (int i = 0; i < size; i++) {
            if (i < 8) {
                for (int j = 0; j < 3; j++) {
                    tower[i][0] = k;
                    if (j == 2)
                        k++;
                    System.out.print(" " + tower[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

    public static int roll(int[][] tower, int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши 1 если 1 ->> 2; напиши 2 если 1 ->> 3;");
        int scan = scanner.nextInt();
        if (scan == 1) {
            int a12 = 1;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < 3; j++) {
                    tower[2][1] = a12;
                    tower[0][0] = 0;
                    System.out.print(" " + tower[i][j] + " ");
                }
                System.out.println();
                return tower[i][2];
            }
        }
        if (scan == 2) {
            int a12 = 1;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < 3; j++) {
                    tower[2][2] = a12;
                    tower[0][0] = 0;
                    System.out.print(" " + tower[i][j] + " ");
                }
                System.out.println();
            }
        }
        return tower[1][1];
    }
}





