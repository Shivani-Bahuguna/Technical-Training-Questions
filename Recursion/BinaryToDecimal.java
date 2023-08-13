import java.util.*;
public class BinaryToDecimal {
    public static int binaryToDecimal(String binary) {
        return binaryToDecimalHelper(binary, binary.length() - 1);
    }
    private static int binaryToDecimalHelper(String binary, int index) {
        if (index < 0) {
            return 0;
        }

        int digit = binary.charAt(index) - '0';
        int power = binary.length() - index - 1;
        int decimal = digit * (int) Math.pow(2, power);
        return decimal + binaryToDecimalHelper(binary, index - 1);
    }
    public static void main(String[] args) {
        String binaryNumber = "101";
        int decimalNumber = binaryToDecimal(binaryNumber);
        System.out.println("The decimal representation of " + binaryNumber + " is: " + decimalNumber);
    }
}