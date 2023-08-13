import java.util.Scanner;

public class PowerOfThree {


    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        System.out.println(isPowerOfThree(num));
    }
    static boolean isPowerOfThree(int n) {
        if(n==1) return true;
        if(n%3 !=0 || n<=0) return false;
        return isPowerOfThree(n/3);
    }
}

