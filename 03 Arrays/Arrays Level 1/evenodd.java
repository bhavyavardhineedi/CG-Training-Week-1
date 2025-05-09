import java.util.Scanner;

public class evenodd {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number :");
		int num=sc.nextInt();
		int n= (num/2)+1;
		int oddarr[]= new int[n];
		int evenarr[]= new int[n];
		int ei=0, oi=0;
		for (int i=1; i<=num; i++){
			if((i%2)==0){
				evenarr[ei]=i;
				ei++;
			}
			else{
				oddarr[oi]=i;
				oi++;
			}
		}
		System.out.println("The numbers in even array are: ");
		for(int i=0;i< ei ;i++){
			System.out.print(evenarr[i]);
		}
		System.out.println("The numbers in odd array are: ");
		for(int i=0;i< oi ;i++){
			System.out.println(oddarr[i]);
		}

	}
}