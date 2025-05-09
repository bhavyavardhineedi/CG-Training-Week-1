import java.util.Scanner;

public class centimeters {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of centimeters :");
		float cm= sc.nextFloat();
		double inch= cm/2.54;
		double feet= inch/12;
		System.out.println("Your Height in cm is "+cm+" while in feet is "+feet+" and inches is "+inch);
	}
}