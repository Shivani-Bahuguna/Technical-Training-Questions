import java.util.*;
public class Pattern20 {

    static int count=1;
    static void blank(int s)
    {
        if(s==0)
            return;
        System.out.print(" ");
        blank(s-1);
    }
    static void rightNum(int n)
    {

        if(n==0)
            return;
        System.out.print(n);
        rightNum(n-1);
    }
    static void leftNum(int n)
    {

        if(n>count)
            return;
        System.out.print(n);
        leftNum(n+1);
    }
    static void print(int row, int n, int s,int start)
    {
        if(row==0)
            return;
        leftNum(n);
        blank(s);
        rightNum(start);
        System.out.println();
        count++;
        print(row-1,n,s-2,start+1);
    }
    public static void main(String[] args) {
        print(5,1,8,1);
    }
}