package calculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator{

    public static void main(String[] args) {

        CalculatorWithMathExtends peremennaya = new CalculatorWithMathExtends();
        double a = (peremennaya.multiply(15,7));
        double b = (peremennaya.divide(28, 5));
        double c = (peremennaya.plus(a, 4.1));
        double e = (peremennaya.exponentiation(b, 2));
        double result = (peremennaya.plus(c,e));
        System.out.println(result);

        System.out.println("Результат разделили на 0 = " + result / 0);
        System.out.println("Результат разделили на 0 = " + result / 0.0d);




 //       4.1 + 15 * 7 + (28 / 5) ^ 2




    }
}
