import java.util.Scanner;

class SuperPower {

    public static void main(String[] args) {
        int a=1;
        int[] b={4,3,3,8,5,2};
        superPow(a,b);

    }
    int base = 1337;
    static int superPow(int a, int[] b) {
        return count(a, b, b.length);
    }




    static int pow(int a, int k){
        if(k == 0){
            return 1;
        }
        a %= base;
        if( k % 2 == 1){
            return (a * pow(a, k - 1)) % base;
        }else{
            int sub = pow(a, k/2);
            return (sub * sub) % base;
        }

    }


    static int count(int a, int[] b, int len){
        if(len == 0){
            return 1;
        }
        int last = b[len - 1];
        int partA = pow(a, last);
        int partB = pow(count(a, b, len - 1) , 10);
        return (partA * partB) % base;
    }
}