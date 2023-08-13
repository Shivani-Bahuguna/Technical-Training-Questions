import java.util.*;
public class Pattern17 {

    public static void printPatternUp(int n, int space1) {
        if (n == 0) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <= space1; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        printPatternUp(n - 1, space1 + 2);
    }
    public static void printPatternDown(int n, int space2) {
        if (n == 6) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <= space2; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        printPatternDown(n + 1, space2 - 2);
    }
    public static void main(String[] args) {
        int n = 5;
        int space1 = 0;
        int space2 = 8;
        printPatternUp(n, space1);
        printPatternDown(1, space2);
    }
}