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
        if (size>2) {
            if (size < 9) {
                char[][] tower = new char[size][3];
                for (int i = 0; i < tower.length; i++) {
                    for (int j = 0; j < 3; j++) {    //идём по столбцам
                        if (j == 0) {
                            tower[i][0] = (char) (i + 49);
                        } else tower[i][j] = (char) ('*');
                        System.out.print(" " + tower[i][j] + " ");    //вывод элемента
                    }
                    System.out.println();    //перенос строки ради визуального сохранения табличной формы
                }
                scanner = new Scanner(System.in);
                System.out.print("11 ->> 1 переместить на 2 ");
                size = scanner.nextInt();
                if (size == 11)
                        for (int i = 0; i < tower.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                    tower[i][0] = (char) (i + 49);
                                    tower[0][0] = (char) ('*');
/*
String a =[1][1];
[1][1]=[2][2];
[2][2]=a;
 */
                                System.out.print(" " + tower[i][j] + " ");
                            }
                            System.out.println();
                        }
                }
            }
        }
    }





