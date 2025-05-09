import java.util.Scanner;

public class compare {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the numbers :");
		int num[]= new int[5];
		for(int i=0;i< num.length ;i++){
			num[i]= sc.nextInt();
		}
		for(int i=0; i<num.length; i++){
			if(num[i]<0){
				System.out.println("The number "+num[i]+" is negative");
			}
			else if(num[i]==0){
				System.out.println("The number "+num[i]+" is zero");
			}
			else{
				//System.out.println("The number "+num[i]+" is positive");
				if(num[i]%2==0){
					System.out.println("The number "+num[i]+" is positive and even");
				}
				else{
					System.out.println("The number "+num[i]+" is positive and odd");
				}
			}
		}
		if(num[0]<num[num.length-1]){
			System.out.println("The first number "+num[0]+" is less than the last number "+num[num.length-1]);
		}
	}
}