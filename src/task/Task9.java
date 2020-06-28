package task;

import java.util.Scanner;

/**
1.3. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход
 вычислений в консоль. Пример: Ввели 181232375, 1 * 8 * 1 * 2 * …. * 5
 **/
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int values=0;

        for (int i = 0; 0 < number; ) {
            int summa = 0;
            values = number % 10;
            summa = summa + values;
            number /= 10;
            System.out.print(summa + " * ");
            

        }



    }
}
