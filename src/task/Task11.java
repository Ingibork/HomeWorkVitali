package task;

/**
 *  1.5 Умножать число long a = 1; на 3 пока не произойдёт переполнение.
 *  В конце в консоль вывести сообщение со значением до переполнения и после переполнения
 */
public class Task11 {
    public static void main(String[] args) {
        long a = 1;

        for ( a = 1; a <Integer.MAX_VALUE+1 ;) {
            System.out.println(a);

        }

        }
    }

