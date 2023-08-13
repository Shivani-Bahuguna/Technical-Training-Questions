import java.util.*;
public class DecimalToBinary {

    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return decimalToBinary(n / 2) + Integer.toString(n % 2);
        }
    }
    public static void main(String[] args) {
        int decimalNumber = 3 ;
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("The binary representation of " + decimalNumber + " is: " + binaryNumber);
    }
}