import java.util.Scanner;

public class grades2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = switch (j) {
                    case 0 -> "Physics";
                    case 1 -> "Chemistry";
                    default -> "Maths";
                };
                int mark;
                do {
                    System.out.print(subject + " (0-100): ");
                    mark = sc.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid input. Please enter a valid mark between 0 and 100.");
                    }
                } while (mark < 0 || mark > 100);
                marks[i][j] = mark;
            }
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d Physics: %d, Chemistry: %d, Maths: %d, Percentage: %.2f%%, Grade: %c\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}
