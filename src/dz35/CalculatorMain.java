package calculator;

public class CalculatorMain {

    public static void main(String[] args) {

        CalculatorWithOperator calculat = new CalculatorWithOperator();
        CalculatorWithMathCopy calculat1 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculat3 = new CalculatorWithMathExtends();


        double a = (calculat.multiply(15, 7));
        double b = (calculat.divide(28, 5));
        double c = (calculat.plus(a, 4.1));
        double e = (calculat.elevate(b, 2));
        double result = (calculat.plus(c, e));

        System.out.println(result);
//       4.1 + 15 * 7 + (28 / 5) ^ 2
        System.out.println("Результат разделили на 0, на ноль делить нельзя = " + result / 0);
        System.out.println("Результат разделили на 0, на ноль делить нельзя) = " + result / 0.0d);
    }
}
