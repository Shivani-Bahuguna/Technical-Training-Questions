import java.util.*;
public class Pattern14 {
    static int no=1;
    static void num(int n)
    {
        if(n==0)
            return;
        System.out.print(no);
        no++;
        num(n-1);
    }
    static void print(int row, int n)
    {
        if(row==0)
            return;
        num(n);
        System.out.println();
        print(row-1,n+1);

    }
    public static void main(String[] args) {
        print(4,1);
    }
}