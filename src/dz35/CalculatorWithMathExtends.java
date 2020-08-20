package dz35;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    public double plus(double a, double b) {
        double result = a + b;
        return result;
    }

    public double minus(double a, double b) {
        double result = a - b;
        return result;
    }

    public double divide(double a, double b) {
        double result = a / b;
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        return result;
    }


    public double pow(double a, int b) {
        double result = Math.pow(a, b);
        return result;
    }

    public double sqrt(double a) {
        double result = Math.sqrt(a);
        return result;
    }

    public double abs(double a) {
        double result = Math.abs(a);
        return result;
    }

}
