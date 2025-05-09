import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int num_emp = 10;
        double[] salaries = new double[num_emp];
        double[] yearsOfService = new double[num_emp];
        double[] bonuses = new double[num_emp];
        double[] newSalaries = new double[num_emp];
        double totalOldSalary = 0.0;
        double totalBonus = 0.0;
        double totalNewSalary = 0.0;
        for (int i = 0; i < num_emp; i++) {
            System.out.println("\nEnter details for employee #" + (i + 1));
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            if (salary <= 0) {
                System.out.println("Invalid salary. Please enter a positive number.");
                i--; 
                continue;
            }
            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();
            if (years < 0) {
                System.out.println("Invalid years of service. Please enter a non-negative number.");
                i--; 
                continue;
            }
            salaries[i] = salary;
            yearsOfService[i] = years;
        }
        for (int i = 0; i < num_emp; i++) {
            double bonusRate = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];
            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }
        System.out.println("\nBONUS AND SALARIES");
        for (int i = 0; i < num_emp; i++) {
            System.out.printf("Employee #%d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }
        System.out.println("\nTOTALS");
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Paid: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

    }
}
