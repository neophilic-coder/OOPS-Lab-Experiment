import java.util.Scanner;
public class Largest
{
	public static void main(String[] args) {
		
		int x, y, z;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        
        if(x>y && x>z){
            System.out.println("The greatest number is:"+x);
        }
        else if(y>z && y>x){
            System.out.println("The greatest number is:"+y);
        }if(z>y && z>x){
            System.out.println("The greatest number is:"+z);
        }
	}
}