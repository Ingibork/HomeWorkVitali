package dz31;

import java.util.Scanner;

/**
 * 1.3. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход
 * вычислений в консоль. Пример: Ввели 181232375, 1 * 8 * 1 * 2 * …. * 5
 **/
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int n1 = 0;
        while (n != 0) {
            n1 = n1 * 10 + n % 10;
            n /= 10;
        }
        int a = n1;
        int values = 0;
        while (a != 0) {
            int a1 = 0;
            a1 = a % 10;
            a1 = a1 + values;
            a /= 10;
            if (a / 10 != 0)
                System.out.print(a1 + " * ");
            else
                System.out.print(" * " + a1);
        }
    }
}
