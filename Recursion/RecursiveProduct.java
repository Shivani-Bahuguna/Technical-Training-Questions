import java.util.List;
public class RecursiveProduct {
    public static int calculateProduct(List<Integer> numbers) {
        return calculateProductHelper(numbers, 0);
    }
    private static int calculateProductHelper(List<Integer> numbers, int index) {
        if (index == numbers.size())
        {
            return 1;
        }
        int currentNumber = numbers.get(index);
        int productOfRemainingNumbers = calculateProductHelper(numbers, index + 1);
        return currentNumber * productOfRemainingNumbers;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 5);
        int product = calculateProduct(numbers);
        System.out.println("Product: " + product);
    }
}