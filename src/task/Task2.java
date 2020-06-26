package task;


public class Task2 {
    public static void main(String[] args) {


        int a = 5 + 2 / 8;
        System.out.println(a); // =5 потмоу что 2/8 будет дробное число, а в инте дробное число записывается только
        // то что идёт до точки  0.25 = Int 0

        a = (5 + 2) / 8;
        System.out.println(a); // =0 потому что 7/8 будет меньше единицы


        int b = 2;
        a = (5 + b++) / 8;
        System.out.println(a); // =0 потому что 7/8 меньше единицы, если бы было ++b тогда ответ был бы 1

        int c = 8;
        a = (5 + b++) / --c;
        System.out.println(a); // =1 т.к. 7/7

        a = (5 * 2 >> b++) / --c;
        System.out.println(a); // =0 т.к. 10 в двоичной системе 1010 сдвигая вправо биты на 7, получим 0. 0/7 = 0

        a = (5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --c;
        System.out.println(a); // =0 т.к. 7<20 false поэтому сравниваем b++ / --c = 0

        // a = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --c; тут знак >= не уместен думаю
        System.out.println("Ошибка");


        boolean q = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println(q); // условие И, false т.к. 12*12 > 119

        q = true && false;
        System.out.println(q); // условие И, false
    }
}
