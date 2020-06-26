package task;

import java.util.Arrays;
import java.util.Scanner;

/*
 Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методо main, данный метод будет
 принимает один параметр и будет возвращать строку в отформатированном виде. В метод
 будет передаваться массив из 10 цифр (от 0 до 9). Данные цифры должны быть помещены
 в строку формата: (XXX) XXX-XXXX. Например передан массив: {1,2,3,4,5,6,7,8,9,0},
 возвращаемый результат: (123) 456-7890.
 */
public class Task6 {
    public static void main(String[] args) {

        String[] numb = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String [] createPhoneNumber;

        System.out.println(Arrays.toString(numb));
    }

    public static String[] createPhoneNumber(String[] numb) {


        String createPhoneNumber =("(" +numb[0]+numb[1]+numb[2] +") "+ numb[3] + numb[4] + numb[5] + " - " +
                numb[6] + numb[7] + numb[8] + numb[9]);

        return numb; // не знаю как стринг обычный в массив вставить
    }

}
