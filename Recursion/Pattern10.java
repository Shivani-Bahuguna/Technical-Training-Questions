import java.util.*;
public class Pattern10 {


    static void blank(int s)


    {
        if (s == 0)
            return;
        System.out.print(" ");
        blank(s - 1);

    }


    static void star()


    {
        System.out.print("*");

    }


    static void print(int row, int s)


    {
        if (row == 0)
            return;
        blank(s);
        star();
        System.out.println();
        print(row - 1, s - 1);

    }



    public static void main(String[] args) {
        print(5, 4);
    }
}