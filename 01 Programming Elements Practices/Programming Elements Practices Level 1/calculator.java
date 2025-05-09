import java.util.Scanner;

public class calculator {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number :");
		float a= sc.nextFloat();
		System.out.println("enter second number :");
		float b= sc.nextFloat();
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ a+" and "+ b+" is "+(a+b) +", "+(a-b) +", "+(a*b)+", and "+(a/b));
	}
}