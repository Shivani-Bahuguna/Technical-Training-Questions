import java.util.*;
public class DecimalToHexadecimal {
    public static String decimalToHexadecimal(int decimal) {
        if (decimal < 16) {
            return getHexDigit(decimal);
        } else {
            return decimalToHexadecimal(decimal / 16) + getHexDigit(decimal % 16);
        }
    }
    private static String getHexDigit(int digit) {
        if (digit < 10) {
            return Integer.toString(digit);
        } else {
            return String.valueOf((char) ('A' + digit - 10));
        }
    }
    public static void main(String[] args) {
        int decimalNumber = 12;
        String hexadecimalNumber = decimalToHexadecimal(decimalNumber);
        System.out.println("The hexadecimal representation of " + decimalNumber + " is: " + hexadecimalNumber);
    }
}