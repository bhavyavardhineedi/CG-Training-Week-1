import java.util.Scanner;

public class divide {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the dividend :");
		int num1= sc.nextInt();
		System.out.println("enter the divisor:");
		int num2= sc.nextInt();
		System.out.println("The Quotient is "+(num1/num2)+" and Reminder is "+(num1%num2)+" of two numbers "+num1+" and "+num2);
	}
}