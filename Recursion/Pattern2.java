class Pattern2 {

    static void blank(int n)
    {
        if(n==0)
            return;
        System.out.print(" ");
        blank(n-1);
    }

    static void star(int n,int row)
    {
        if(n==0)
            return;
        if(row==1||row==5){
            System.out.print("*");
            star(n-1,row);
        }
        else
        {
            System.out.print("*");
            blank(3);
            System.out.print("*");
        }

    }

    static void print(int row, int n)
    {
        if(row==0)
            return;
        star(n,row);
        System.out.println();
        print(row-1,n);

    }

    public static void main(String[] args) {
        print(5,5);
    }
}