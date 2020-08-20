package stringgeneric;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomString {
    static String random(int stringLength){

    String s = "йцукенгшщзхъфывапролджэячсмитьбююююю.ЙЦУ" +
            "КЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮqwertyuiop[]a" +
            "sdfghjkl;'zxcvbnm,. /QWERTYUIOPASDFGHJKLZXCVBNMёЁ`~!@#$%^&*";

    Random random = new Random();
    StringBuilder builder = new StringBuilder();
        for (int i = 0; i < stringLength; i++) {
            int number = random.nextInt();
        }
        return builder.toString();
    }


}

