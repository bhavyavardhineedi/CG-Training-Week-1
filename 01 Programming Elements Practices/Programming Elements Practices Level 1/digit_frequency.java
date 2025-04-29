import java.util.Scanner;

public class digit_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int count = 0;
        int temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
        System.out.println("\nFrequency of digits in " + originalNum + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " => " + frequency[i] + " time(s)");
            }
        }
    }
}
