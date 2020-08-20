package calculator;

/**
 * * 8*. Создать класс CalculatorWithCounter, все методы в данном классе НЕ статические.
 * У данного класса должно быть три конструктора
 * * (или один если сможете, это ещё не изучено https://refactoring.guru/ru/design-patterns/decorator)
 * * один принимающий в себя CalculatorWithOperator, второй CalculatorWithMathCopy,
 * третий CalculatorWithMathExtends.
 * * Данные конструкторы должны сохранять переданные калькуляторы в приватные
 * поля класса для дальнейшего их использования.
 * * Он также имеет 7 методов как и другие калькуляторы + 1 метод getCountOperation()
 * который должен вернуть значение внутреннего счётчика.
 * * В реализации методов должен быть вызван один из объектов переданный в констуктор
 * при создании объекта CalculatorWithCounter,
 * * и вызвать соответсвующий метод у них. К примеру. Если вызывают метод plus
 * у CalculatorWithCounter то он должен вызвать метод plus у объекта CalculatorWithOperator
 * * или у объекта CalculatorWithMathCopy или у объекта  CalculatorWithMathExtends
 * (смотря что передали в конструктор) и увеличить значение внутреннего счётчика операций.
 * *
 * public class CalculatorWithCounter {
 *
 *     public CalculatorWithCounter(CalculatorWithOperator) {
 *         CalculatorWithOperator value1 = new CalculatorWithOperator();
 *     }
 *
 *     public CalculatorWithCounter(CalculatorWithMathCopy) {
 *         CalculatorWithMathCopy value2 = new CalculatorWithMathCopy();
 *     }
 *
 *     public CalculatorWithCounter(CalculatorWithMathExtends) {
 *         CalculatorWithMathExtends value3 = new CalculatorWithMathExtends();
 *     }
 */
public class CalculatorWithCounter {

    private double CalculatorWithOperator;
    private double CalculatorWithMathCopy;
    private double CalculatorWithMathExtends;

    public CalculatorWithCounter(CalculatorWithOperator calculat) {

    }

    public CalculatorWithCounter(CalculatorWithMathCopy calculat2) {

    }

    public CalculatorWithCounter(CalculatorWithMathExtends calculat3) {

    }

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

    public int getCountOperation() {
        return getCountOperation();

    }


}
