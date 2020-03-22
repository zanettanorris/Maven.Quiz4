package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
       Integer midpoint = (values.length)/2;
        return values[midpoint];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] resultArray = new String[values.length - 1];
        Integer midpoint = (values.length) / 2;
        for (int i = 0; i < midpoint; i++)
            resultArray[i] = values[i];
        for (int j = midpoint + 1; j < values.length; j++)
            resultArray[j - 1] = values[j];
        return resultArray;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
String[] resultArray = new String[values.length-1];
for (int i = 0; i < values.length-1; i++)
resultArray[i] = values [i];
    return resultArray;
    }
}