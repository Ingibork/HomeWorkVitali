package dz34;


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
        int count = scanner.nextInt();
        int columnSize = 3;
        if (count < 3) {
            System.out.println("Колец может быть от 3 до 8");
            return;
        }

        int[][] map = new int[count][columnSize];

        for (int i = 0; i < map.length; i++) {
            map[i][0] = i + 1;
        }

        for (int i = 0; i < map.length; i++) {
            if (map[i][map.length-1] !=0){
                System.out.println("Игра закончена");
                break;
            }
        }

        printMap(map);

        int[] indexs = getIndexFprOperation(getNextOperation());

        moveElement(indexs[0], indexs[1], map);

        printMap(map);

        indexs = getIndexFprOperation(getNextOperation());

        moveElement(indexs[0], indexs[1], map);

        printMap(map);

        indexs = getIndexFprOperation(getNextOperation());

        moveElement(indexs[0], indexs[1], map);

        printMap(map);

        indexs = getIndexFprOperation(getNextOperation());

        moveElement(indexs[0], indexs[1], map);

        printMap(map);

        indexs = getIndexFprOperation(getNextOperation());

        moveElement(indexs[0], indexs[1], map);

        printMap(map);

        indexs = getIndexFprOperation(getNextOperation());

        moveElement(indexs[0], indexs[1], map);

        printMap(map);

        indexs = getIndexFprOperation(getNextOperation());

        moveElement(indexs[0], indexs[1], map);

        printMap(map);

        indexs = getIndexFprOperation(getNextOperation());

        moveElement(indexs[0], indexs[1], map);

        printMap(map);
    }



    public static int[] getIndexFprOperation(int operation) {
        int from = -1, to = -1;

        switch (operation) {
            case 1:
                from = 0;
                to = 1;
                break;
            case 2:
                from = 0;
                to = 2;
                break;
            case 3:
                from = 1;
                to = 0;
                break;
            case 4:
                from = 1;
                to = 2;
                break;
            case 5:
                from = 2;
                to = 0;
                break;
            case 6:
                from = 2;
                to = 1;
                break;
        }

        return new int[]{from, to};
    }

    public static int getNextOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите куда хотите сделать ход:");
        System.out.println("1) 1 ->> 2");
        System.out.println("2) 1 ->> 3");
        System.out.println("3) 2 ->> 1");
        System.out.println("4) 2 ->> 3");
        System.out.println("5) 3 ->> 1");
        System.out.println("6) 3 ->> 2");
        System.out.println("7) Выйти из игры");

        return scanner.nextInt();
    }


    /**
     * Перемещение кольца
     *
     * @param from идекс откуда перемещаем
     * @param to   индекс куда
     * @param map  место куда перемещаем
     */

    public static void moveElement(int from, int to, int[][] map) {
        if (from < 0 || to < 0) {
            System.out.println("Введено не верное число");
        }

        for (int i = 0; i < map.length; i++) {
            int fromValue = map[i][from];
            if (fromValue != 0) {
                for (int j = 0; j < map.length; j++) {
                    int toValue = map[j][to];
                    if ((j == 0 && toValue != 0)) {
                        System.out.println("Штырь " + to + " переполнен");
                        continue;
                    } else if (toValue < fromValue && toValue != 0) {
                        System.out.println("Со штыря " + from + " на штырь " + to + " нельзя переместить кольцо");
                        continue;
                    } else if (toValue > fromValue) {
                        map[i][from] = 0;
                        map[j - 1][to] = fromValue;
                        break;
                    } else if (j + 1 == map.length) {
                        map[i][from] = 0;
                        map[j][to] = fromValue;
                    }

                }
                break;
            }
        }
    }

    public static void printMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                int value = map[i][j];
                if (value == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }
}








