import java.util.Scanner;

public class age_height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ":");
            ages[i] = sc.nextInt();

            System.out.println("Enter height (in cm) of " + names[i] + ":");
            heights[i] = sc.nextDouble();
        }
        int youngest = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngest]) {
                youngest = i;
            }
        }
        int tallest = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }
        System.out.println("The youngest friend is: " + names[youngest] + " (" + ages[youngest] + " years old)");
        System.out.println("The tallest friend is: " + names[tallest] + " (" + heights[tallest] + " cm tall)");
    }
}
