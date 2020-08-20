package dz31;

/**
 * 1.5 Умножать число long a = 1; на 3 пока не произойдёт переполнение.
 * В конце в консоль вывести сообщение со значением до переполнения и после переполнения
 */
public class Task11 {
    public static void main(String[] args) {
        double a = 1;
        double b = 3;
        double result = a;
        do {
            double tmp = result * b;
            if(tmp == Double.POSITIVE_INFINITY || tmp == Double.NEGATIVE_INFINITY){
                System.out.println("Переполнение - " +tmp);
                break;
            } else{
                result = tmp;
            }
        } while (true);
        System.out.println("Последний результат " + result);




    }
}


