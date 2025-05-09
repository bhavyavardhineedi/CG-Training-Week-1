import java.util.Scanner;

public class arr2dto1d {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of rows :");
		int r=sc.nextInt();
		System.out.println("enter the number of columns :");
		int c=sc.nextInt();
		int arr2d[][]= new int[r][c];
		int arr1d[]=new int[r*c];
		int a=0;
		System.out.println("enter the elements of 2d array");
		for(int i=0;i<r ;i++){
			for(int j=0;j<c;j++){
				arr2d[i][j]=sc.nextInt();
				arr1d[a]=arr2d[i][j];
				a++;
			}
		}
		System.out.println("the 2d array is :");
		for(int i=0;i<r ;i++){
			for(int j=0;j<c;j++){
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println("\n");
		}
		System.out.println("the 1d array is :");
		for(int k=0;k<(r*c);k++){
			System.out.print(arr1d[k]+" ");
		}

	}
}