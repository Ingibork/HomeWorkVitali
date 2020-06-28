package task;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

/*
 1.2. Перемножить числа от 1 до числа (включительно) введеннго через аргумент к исполняемой программе.
 Пример: Ввели 5, должно получиться 1 * 2 * 3 * 4 * 5
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; ++i) {
            if (i == number) {
                System.out.println(i);
                break;
            }
            System.out.print(i + " * ");
        }
    }
}
