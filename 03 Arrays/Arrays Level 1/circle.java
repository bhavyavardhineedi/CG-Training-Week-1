import java.util.Scanner;

public class circle {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter radius of the circle :");
		float rad= sc.nextFloat();
		double pi= Math.PI;
		System.out.println("area if the circle is " + (pi*rad*rad) + " sq units");
	}
}