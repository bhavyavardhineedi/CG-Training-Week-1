import java.util.Scanner;

public class bmi2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            double height;
            do {
                System.out.print("Enter height in meters (positive value): ");
                height = sc.nextDouble();
            } while (height <= 0);
            personData[i][0] = height;
            double weight;
            do {
                System.out.print("Enter weight in kilograms (positive value): ");
                weight = sc.nextDouble();
            } while (weight <= 0);
            personData[i][1] = weight;
            double bmi = weight / (height * height);
            personData[i][2] = bmi;
            if (bmi <= 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Optimum range";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s\n",
                (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
