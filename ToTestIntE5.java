import java.util.Scanner;
interface Test{
	void Square();
}
class Arithmetic implements Test{
	Scanner sc = new Scanner(System.in);
	
	public void Square(){
	int arr[] = new int[10];
	int i;
	System.out.println("Enter an array of 10 numbers");
		for(i=0;i<10;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("The squares of array elements are:");
		for(i=0;i<10;i++){
			System.out.print(arr[i]*arr[i]+ " ");
		}
	}
}
class ToTestInt{
	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		Test obj = new Arithmetic();
		System.out.println("Sum of arrays is: ");
		obj.Square();
	}	
}
