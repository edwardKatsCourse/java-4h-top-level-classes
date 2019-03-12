package access_modifiers;

public class TaxCalculatorUtil {

    public static Double getSalaryAfterTax(Employee e) {
        Double basicTax = e.salary - e.tax;
        Double totalAfterTax = basicTax - calculateTaxForBitualLeumi(basicTax);

        return calculatePension(totalAfterTax);
    }

    private static Double calculateTaxForBitualLeumi(Double initialSalary) {
        return (initialSalary / 100) * 3;
    }

    private static Double calculatePension(Double afterTaxSalary) {
        return afterTaxSalary - (afterTaxSalary / 100) * 6.5;
    }
}
