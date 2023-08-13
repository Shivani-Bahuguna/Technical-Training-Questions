import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        System.out.println(isPowerOfFour(num));
    }

    static boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n%4 != 0 || n<=0) return false;
        return isPowerOfFour(n/4);
    }

}