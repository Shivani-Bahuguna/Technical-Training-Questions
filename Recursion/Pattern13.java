import java.util.*;
public class Pattern13 {

    static void blank(int s)
    {
        if(s==0)
            return;
        System.out.print(" ");
        blank(s-1);
    }
    static void star(int n)
    {
        if(n==0)
            return;
        System.out.print("*");
        star(n-1);
    }

    static void print(int row, int n,int s)
    {
        if(row==0)
            return;
        blank(s);
        star(n);
        System.out.println();
        if(row<6)
            print(row-1,n-1,s+1);
        else
            print(row-1,n+1,s-1);
    }
    public static void main(String[] args) {
        print(9,1,4);
    }
}