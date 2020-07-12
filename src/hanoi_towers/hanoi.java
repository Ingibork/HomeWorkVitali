package hanoi_towers;

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
        System.out.print("Введите размер массива: - ");
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
//1111111111111111111111111111111111
        System.out.println("Напиши 1 если 1 ->> 2; напиши 2 если 1 ->> 3;");
        int scan = scanner.nextInt();
        if (scan == 1) {
            int a12 = 1;
            for (int i = 0; i < size; i++) {
                if (i < 8)
                    for (int j = 0; j < 3; j++) {
                        tower[2][1] = a12;
                        tower[0][0] = 0;
                        System.out.print(" " + tower[i][j] + " ");
                    }
                System.out.println();
            }
        }
        if (scan == 2) {
            int a12 = 1;
            for (int i = 0; i < size; i++) {
                if (i < 8)
                    for (int j = 0; j < 3; j++) {
                        tower[2][2] = a12;
                        tower[0][0] = 0;
                        System.out.print(" " + tower[i][j] + " ");
                    }
                System.out.println();
            }
// 2222222222222222222222222222222222222222222
            System.out.println("Напиши 1 если 2 ->> 2; напиши 2 если 1 ->> 1;");
            scan = scanner.nextInt();
            if (scan == 1) {
                int a13 = 2;
                for (int i = 0; i < size; i++) {
                    if (i < 8)
                        for (int j = 0; j < 3; j++) {
                            tower[2][1] = a13;
                            tower[1][0] = 0;
                            System.out.print(" " + tower[i][j] + " ");
                        }
                    System.out.println();
                }
            }
            if (scan == 2) {
                int a13 = 1;
                for (int i = 0; i < size; i++) {
                    if (i < 8)
                        for (int j = 0; j < 3; j++) {
                            tower[0][0] = a13;
                            tower[2][2] = 0;
                            System.out.print(" " + tower[i][j] + " ");
                        }
                    System.out.println();
                }
//33333333333333333333333333333333333333333333
                System.out.println("Напиши 1 если 2 ->> 2; напиши 2 если 1 ->> 1;");
                scan = scanner.nextInt();
                if (scan == 1)
                System.out.println("3->>1");
                int a21 =1;
                for (int i = 0; i < size; i++) {
                    if (i < 8)
                        for (int j = 0; j < 3; j++) {
                            tower[1][0] = a21;
                            tower[2][1] = 0;
                            System.out.print(" " + tower[i][j] + " ");
                        }
                    System.out.println();
                }

                System.out.println("3->>2");
                int a32 = scanner.nextInt();
                for (int i = 0; i < size; i++) {
                    if (i < 8)
                        for (int j = 0; j < 3; j++) {
                            tower[2][1] = a32;
                            tower[2][2] = 0;
                            System.out.print(" " + tower[i][j] + " ");
                        }
                    System.out.println();
                }

                System.out.println("1->>2");
                int a122 = scanner.nextInt();
                for (int i = 0; i < size; i++) {
                    if (i < 8)
                        for (int j = 0; j < 3; j++) {
                            tower[1][1] = a122;
                            tower[1][0] = 0;
                            System.out.print(" " + tower[i][j] + " ");
                        }
                    System.out.println();
                }

                System.out.println("3->>1");
                int a31 = scanner.nextInt();
                for (int i = 0; i < size; i++) {
                    if (i < 8)
                        for (int j = 0; j < 3; j++) {
                            tower[2][2] = a31;
                            tower[2][0] = 0;
                            System.out.print(" " + tower[i][j] + " ");
                        }
                    System.out.println();
                }

                System.out.println("2->>1");
                int a211 = scanner.nextInt();
                for (int i = 0; i < size; i++) {
                    if (i < 8)
                        for (int j = 0; j < 3; j++) {
                            tower[2][0] = a211;
                            tower[1][1] = 0;
                            System.out.print(" " + tower[i][j] + " ");
                        }
                    System.out.println();
                }

                System.out.println("2->>3");
                int a23 = scanner.nextInt();
                for (int i = 0; i < size; i++) {
                    if (i < 8)
                        for (int j = 0; j < 3; j++) {
                            tower[1][2] = a23;
                            tower[2][1] = 0;
                            System.out.print(" " + tower[i][j] + " ");
                        }
                    System.out.println();
                }

                System.out.println("1->>3");
                int a133 = scanner.nextInt();
                for (int i = 0; i < size; i++) {
                    if (i < 8)
                        for (int j = 0; j < 3; j++) {
                            tower[0][2] = a133;
                            tower[2][0] = 0;
                            System.out.print(" " + tower[i][j] + " ");
                        }
                    System.out.println();
                }
            }
        }
    }
}



