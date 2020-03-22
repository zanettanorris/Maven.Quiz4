package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
//    private sysout resultArray;

    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        Double square = value * value;
        return square;

    }

    public static Double[] squareRoots(Double... value) {
        Double[] rootsArray = new Double[value.length];
        for (int i = 0; i < value.length; i++) {
            Double result = squareRoot(value[i]);
            rootsArray[i] = result;
        }
        return rootsArray;

    }

    public static Double[] squares(Double... values) {
        Double[] squaresArray = new Double[values.length];
        for (int i = 0; i < values.length; i++) {
            Double result = square(values[i]);
            squaresArray[i] = result;
        }
        return squaresArray;
    }

    public static Double add(Double value1, Double value2) {
        Double sum = value1 + value2;
        return sum;
    }

    public static Double subtract(Double value1, Double value2) {

        Double difference = value1 - value2;
        return difference;
    }

    public static Double divide(Double divisor, Double dividend) {
        Double result = divisor / dividend;
        return result;
    }
}
