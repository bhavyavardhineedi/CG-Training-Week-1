import java.util.Scanner;

public class chocolate {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of children:");
		int num1= sc.nextInt();
		System.out.println("enter the nu,ber of chocolates:");
		int num2= sc.nextInt();
		System.out.println("The number of chocolates each child gets is "+ (num2/num1)+" and the number of remaining chocolates are " + (num2%num1));
	}
}