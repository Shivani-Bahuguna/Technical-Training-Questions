import java.util.*;
public class Pattern18 {
    public static void printPatternUp(int n) {
        if (n == 6) {
            return;
        }
        for (int i = 4; i >= n; i--) {
            System.out.print(" ");
        }
        for (int i = n; i <= 5; i++) {
            System.out.print("*");
        }
        System.out.println();
        printPatternUp(n + 1);
    }
    public static void printPatternDown(int n, int count) {
        if (n == 5) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= count; i++) {
            System.out.print("*");
        }
        System.out.println();
        printPatternDown(n + 1, count + 1);
    }

    public static void main(String[] args) {
        printPatternUp(1);
        printPatternDown(1, 2);
    }
}