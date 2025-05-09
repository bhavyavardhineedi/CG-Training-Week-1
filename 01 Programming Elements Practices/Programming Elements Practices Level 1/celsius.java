import java.util.Scanner;

public class celsius {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter Fahrenheit temp:");
		float f= sc.nextFloat();
		System.out.println("The "+f+" Fahrenheit is "+ ((f - 32) * 5/9) + " Celsius");
	}
}