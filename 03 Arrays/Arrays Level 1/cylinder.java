import java.util.Scanner;

public class cylinder {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter radius of the circle :");
		float r= sc.nextFloat();
		System.out.println("enter height of the circle :");
		float h= sc.nextFloat();
		double pi= Math.PI;
		System.out.println("volume if the cylinder is " + (pi*r*r*h) + " cube units");
	}
}