import java.util.Scanner;
public class Pattern{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		int i,j=0;
		for(i=0;i<n;i++){
			for(j=2*i+1;j>0;j--){
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}