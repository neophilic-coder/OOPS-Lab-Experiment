import java.util.Scanner;
public class Squares{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] c = new int[10];
		int i,sum = 0;
		System.out.println("Enter an array of 10 numbers");
		for(i=0;i<10;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("The squares of array elements are:");
		for(i=0;i<10;i++){
			c[i]= arr[i]*arr[i];
			System.out.print(c[i]+ " ");
		}
		for(i=0;i<10;i++){
			sum = sum + c[i];
		}
		System.out.println("\nThe sum of all array elements is: "+sum);
	}
}
