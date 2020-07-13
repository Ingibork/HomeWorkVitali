package hanoi_towers3.hanoi_towers;

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
        System.out.print("Введите количество колец - ");
        int size = scanner.nextInt();
        if (size > 2) {
            if (size < 9) {
                int[][] tower = new int[size][3];
                for (int i = 0; i < tower.length; i++) {
                    tower[i][0] = i + 1;
                }
                printTower(tower);
                for (int i = 7; i < tower.length; i--) {
                    for (int j = 0; j < tower[i].length; j++) {
                        int value = tower[i][j];
                        if (value<tower[i+1][j]) {

                            System.out.print(value + " ");
                        }
                        System.out.print(value + " !!!!");
                    }
                }
            }

        }
    }

    public static void printTower(int[][] tower) {
        for (int i = 0; i < tower.length; i++) {
            for (int j = 0; j < tower[i].length; j++) {
                int value = tower[i][j];
                if (value == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }

   // public static void exaple(int[][] tower) {

//    }
}




