import java.util.Arrays;
public class RecursiveSalaryTax {
    public static double[] addTax(double[] salaries) {
        return addTaxHelper(salaries, 0);
    }
    private static double[] addTaxHelper(double[] salaries, int index) {
        if (index == salaries.length)
        {
            return new double[0];
        }
        double currentSalary = salaries[index];
        double taxedSalary = currentSalary + (currentSalary * 0.1);
        double[] updatedSalaries = addTaxHelper(salaries, index + 1);
        double[] result = new double[updatedSalaries.length + 1];
        result[0] = taxedSalary;
        System.arraycopy(updatedSalaries, 0, result, 1, updatedSalaries.length);
        return result;
    }
    public static void main(String[] args) {
        double[] salaries = { 5000.0, 7000.0, 10000.0, 15000.0 };
        double[] updatedSalaries = addTax(salaries);
        System.out.println("Updated salaries: " + Arrays.toString(updatedSalaries));
    }
}