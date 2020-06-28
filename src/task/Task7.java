package task;

/*
    1.1. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке.
 */
public class Task7 {
    public static void main(String[] args) {
        int b = 2;
        for (int i = 1; i <= 10; i++) {
            int c = i * b;
            System.out.println(b + " * " + i + " = " + c);
            if (i == 9) {
                b++;  // когда произойдёт последнее умножение на 9, то B увеличится на 1
                i = 1;
                System.out.printf(" ");
            }
            if (b == 10) { // заканчиваем на b = 10
                break;
            }
        }
    }
}
