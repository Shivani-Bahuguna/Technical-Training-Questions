public class RecursiveMaxElement
{
    public static int findMax(int[] array) {
        return findMaxHelper(array, 0, array.length - 1);
    }
    private static int findMaxHelper(int[] array, int start, int end) {
        if (start == end)
        {
            return array[start];
        }
        else {
            int mid = (start + end) / 2;
            int leftMax = findMaxHelper(array, start, mid);
            int rightMax = findMaxHelper(array, mid + 1, end);
            return Math.max(leftMax, rightMax);
        }
    }
    public static void main(String[] args) {
        int[] array = { 4, 9, 2, 6, 5, 1, 8, 3, 7 };
        int max = findMax(array);
        System.out.println("Max element: " + max);
    }
}