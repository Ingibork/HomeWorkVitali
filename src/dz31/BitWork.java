package bit;

/*
 1.2 Использовать ВСЕ возможные побитовые операции с числами 42 и 15.
 1.3 Использовать ВСЕ возможные побитовые операции с числами -42 и -15.
 1.4 В комментариях к каждой операции написать двоичный код каждого числа и результата операции.
 */
public class BitWork {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;

        System.out.println(a | b); // OR 101010 1111 = 101111
        System.out.println(a & b); // AND 101010 1111 = 1010
        System.out.println(a ^ b); // XOR 101010 1111 = 100101
        System.out.println(a >> 2); // Сдвиг вправо 101010 = 1010
        System.out.println(b >> 2); // Сдвиг вправо 1111 = 11
        System.out.println(a >>> 2); // Сдвиг вправо с заполнением нулями 101010 = 1010
        System.out.println(b >>> 2); // Сдвиг вправо с заполнением нулями 1111 = 11
        System.out.println(a << 2); // Сдвиг влево 101010 = 10101000
        System.out.println(b << 2); // Сдвиг влево 1111 = 111100
        System.out.println(~a); // NOT 101010 = -101011
        System.out.println(~b); // NOT 1111 = -10000
        System.out.println(a |= b); // OR с присваиванием 101010 1111 = 101111
        System.out.println(a &= b); // AND с присваиванием 101010 1111 = 1111
        System.out.println(a ^= b); // XOR с присваиванием 101010 1111 = 0000

        a = -42;
        b = -15;

        System.out.println("Отрицательные числа");
        System.out.println(a | b); // OR -101010 -1111 = -1001
        System.out.println(a & b); // AND -101010 -1111 = -110000
        System.out.println(a ^ b); // XOR -101010 -1111 = 100111
        System.out.println(a >> 2); // Сдвиг вправо -101010 = -1011
        System.out.println(b >> 2); // Сдвиг вправо -1111 = -100
        System.out.println(a >>> 2); // Сдвиг вправо с заполнением нулями -101010 = 111111111111111111111111110101
        System.out.println(b >>> 2); // Сдвиг вправо с заполнением нулями -1111 = 111111111111111111111111111100
        System.out.println(a << 2); // Сдвиг влево -101010 = -10101000
        System.out.println(b << 2); // Сдвиг влево -1111 = -111100
        System.out.println(~a); // NOT -101010 = 101001
        System.out.println(~b); // NOT -1111 = 1110
        System.out.println(a |= b); // OR с присваиванием -101010 -1111 = -1001
        System.out.println(a &= b); // AND с присваиванием -101010 -1111 = -1111
        System.out.println(a ^= b); // XOR с присваиванием -101010 -1111 = 0000


    }
}
