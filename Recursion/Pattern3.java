class Pattern3 {

    static void star(int n)
    {
        if(n==0)
            return;
        System.out.print("*");
        star(n-1);
    }

    static void print(int row, int n)
    {
        if(row==0)
            return;
        star(n);
        System.out.println();
        print(row-1,n+1);
    }
    public static void main(String[] args) {
        print(5,1);
    }
}