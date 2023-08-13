import java.util.*;
public class HexadecimalToBinary {
    public static String hexadecimalToBinary(String hexadecimal) {
        StringBuffer binary = new StringBuffer();
        for (int i = 0; i < hexadecimal.length(); i++) {
            char hexDigit = hexadecimal.charAt(i);
            binary.append(hexDigitToBinary(hexDigit));
        }
        return binary.toString();
    }
    static String hexDigitToBinary(char hexDigit) {
        int decimal = Character.digit(hexDigit, 16);
        String binary = Integer.toBinaryString(decimal);
        int paddingLength = 4 - binary.length();
        StringBuffer paddedBinary = new StringBuffer();
        for (int i = 0; i < paddingLength; i++) {
            paddedBinary.append('0');
        }
        paddedBinary.append(binary);
        return paddedBinary.toString();
    }
    public static void main(String[] args) {
        String hexadecimalNumber = "A";
        String binaryNumber = hexadecimalToBinary(hexadecimalNumber);
        System.out.println("The binary representation of " + hexadecimalNumber + " is: " + binaryNumber);
    }
}