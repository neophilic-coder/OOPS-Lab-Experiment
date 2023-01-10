import java.util.Scanner;
public class MonthName{
	public static void main(String[] args){
		int m;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month number: ");
		m = sc.nextInt();
		switch(m){
			case 1:
				System.out.println("1 to January");
				break;
			case 2:
				System.out.println("2 to February");
				break;
			case 3:
				System.out.println("3 to March");
				break;
			case 4:
				System.out.println("4 to April");
				break;
			case 5:
				System.out.println("5 to May");
				break;
			case 6:
				System.out.println("6 to June");
				break;
			case 7:
				System.out.println("7 to July");
				break;
			case 8:
				System.out.println("8 to August");
				break;
			case 9:
				System.out.println("9 to September");
				break;
			case 10:
				System.out.println("10 to October");
				break;
			case 11:
				System.out.println("11 to November");
				break;
			case 12:
				System.out.println("12 to December");
				break;
			default:
				System.out.println("Enter valid month number");
				break;
		}
	}
}
