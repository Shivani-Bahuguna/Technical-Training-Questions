import java.util.*;
public class DecimalToOctal {
    public static String decimalToOctal(int decimal) {
        if (decimal < 8) {
            return Integer.toString(decimal);
        } else {
            return decimalToOctal(decimal / 8) + Integer.toString(decimal % 8);
        }
    }
    public static void main(String[] args) {
        int decimalNumber = 10;
        String octalNumber = decimalToOctal(decimalNumber);
        System.out.println("The octal representation of " + decimalNumber + " is: " + octalNumber);
    }
}