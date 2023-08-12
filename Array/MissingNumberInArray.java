import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] array = {6,1,2,8,3,4,7,10,5};
        int n=10;
        System.out.println(missingNumber(array,n));
    }
    static int missingNumber(int[] array, int n) {
        Arrays.sort(array);
        for(int i = 1; i<= n; i++) {
            if(!searching(array, i)) {
                return i;
            }
        }
        return -1;
    }

    static boolean searching(int[] array, int target) {
        boolean flag = false;
        int start = 0;
        int end = array.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target < array[mid]) {
                end = mid-1;
            } else if(target > array[mid]){
                start = mid+1;
            } else {
                flag = true;
                break;
            }
        }
        return flag;
    }
}