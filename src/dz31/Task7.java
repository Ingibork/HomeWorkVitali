package task;

/*
    1.1. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке.
 */
public class Task7 {
    public static void main(String[] args) {
        for (int a = 0; a < 2; a++) {
            for (int j = 2; j <= 10; j++) {
                for (int x = 0; x < 4; x++) {
                    int i = 2 + a * 4 + x;
                    System.out.printf("%2d x %2d = %-5d", i, j, i * j);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

