import java.util.Scanner;

public class avg {
	public static void main(String[] args){
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Enter Sam's mark in Maths:");
		//int math= sc.nextInt();
		//System.out.println("Enter Sam's mark in Physics:");
		//int phy= sc.nextInt();
		//System.out.println("Enter Sam's mark in Chemistry:");
		//int chem= sc.nextInt();
		int math=94, phy=95, chem=96;
		float d= (math+phy+chem)/3;
		System.out.println("Sam’s average mark in PCM is " + d);
	}
}