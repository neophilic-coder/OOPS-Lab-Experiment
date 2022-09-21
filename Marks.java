import java.util.Scanner;
public class Marks{
	public static void main(String[] args){
	Scanner console = new Scanner(System.in);
	int[] arr = new int[10];
	int i,j,n;
	int temp = 0;
	for(i=0;i<10;i++){
		System.out.print("Marks of student "+i+" are: ");
		arr[i] = console.nextInt();
	}
	for(i=0;i<10;i++){
		for(j=i+1;j<10;j++){
			if(arr[i]>arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println("Marks in ascending order are: "+arr[i]);
	}
	for(i=0;i<10;i++){
		if(arr[i]<40){
			System.out.println(arr[i]+ " FAIL ");
		}
		else if(arr[i]>=40 && arr[i]<=50){
			System.out.println(arr[i]+ " PASS ");
		}
		else if(arr[i]>=51 && arr[i]<=75){
			System.out.println(arr[i]+ " MERIT ");
		}
		else{
			System.out.println(arr[i]+ " DISTINCTION ");
		}
	}
}
}

	