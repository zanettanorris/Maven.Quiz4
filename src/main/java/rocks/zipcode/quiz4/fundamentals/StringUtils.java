package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        char[] chars = string.toCharArray();
        char c =  chars[chars.length / 2];
        return c;
    }

    public static String capitalizeMiddleCharacter(String str) {
        char[] chars = str.toCharArray();
        chars[chars.length / 2] = Character.toUpperCase(getMiddleCharacter(str));
        String output = String.valueOf(chars);
        return output;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        char[] chars = str.toCharArray();
        chars[chars.length / 2] = Character.toLowerCase(getMiddleCharacter(str));
        String output = String.valueOf(chars);
        return output;
    }
    public static Boolean isIsogram(String str) {
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        Boolean has = false;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i))
                has = true;
        }
        return has;
    }


    public static String removeConsecutiveDuplicateCharacters(String str) {
        char[] S = str.toCharArray();
//        for (int i = 0; i < str.length(); i++){
//if (chars[i] == chars[i+1])
//    //then skip both i and i+1;
//        StringBuilder output = new StringBuilder();
////
////        for (int i = 0; i < str.length(); i++) {
////            if (str.charAt(i) != str.charAt(i + 1));
////
//////            if (str.charAt(i) == str.charAt(i - 1) || str.charAt(i) == str.charAt(i + 1)) ;
////             output.append(str.charAt(i));
////        }
////            return output.toString();

        {int n = S.length;
            if (n < 2) {
                return str;
            }
            int j = 0;
            for (int i = 1; i < n; i++) {
                if (S[j] != S[i]) {
                    j++;
                    S[j] = S[i];
                }
            }
            return String.valueOf(Arrays.copyOfRange(S, 0, j + 1));
        }
    }


    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}
