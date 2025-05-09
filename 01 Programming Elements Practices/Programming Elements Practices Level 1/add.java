import java.util.Scanner;

public class add {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:");
		int num1= sc.nextInt();
		System.out.println("enter next number:");
		int num2= sc.nextInt();
		System.out.println("sum is " + (num1+num2));
	}
}