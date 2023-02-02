import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies = scanner.nextInt();
        int[] incomes = new int[numberOfCompanies];
        for (int i = 0; i < incomes.length; i++) {
            incomes[i] = scanner.nextInt();
        } Integer maxTaxPayer = null;
        double maxTax = 0;
        for (int i = 0; i < incomes.length; i++) {
            double tax = scanner.nextDouble();
            double taxPerCompany = incomes[i]/100.0 * tax;
            if (taxPerCompany > maxTax) {
                maxTax = taxPerCompany;
                maxTaxPayer = i+1;
            }
        } System.out.println(maxTaxPayer);
    }
}
