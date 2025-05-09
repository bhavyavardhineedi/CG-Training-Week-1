import java.util.Scanner;

public class exponent {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the base:");
		int b= sc.nextInt();
		System.out.println("enter the power:");
		int p= sc.nextInt();
		System.out.println(b+" to the power of "+ p+ " is "+ (Math.pow(b,p)));
	}
}