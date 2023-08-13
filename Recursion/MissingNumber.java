import java.util.ArrayList;

class MissingNumber {
    int missingNumber(int array[], int n) {
        // Your Code Here
        ArrayList<Integer> al=new ArrayList<Integer>();
        int s=0;
        int s1=0;
        for(int a:array)
        {
            s+=a;
        }
        for(int i=1;i<=n;i++)
        {
            s1+=i;
        }
        return (Math.abs(s1-s));
    }
}
