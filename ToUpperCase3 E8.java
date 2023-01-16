import java.util.Scanner;

public class ToUpperCase3{
	static String printAgain(String s){
		String ans = " ";
		char ch =' ';
		for(int i =0;i<(s.length());i++){
			if(s.charAt(i)>='a' && s.charAt(i)<='z'){
				ch = (char)(s.charAt(i)-32);
			}
			else{
				ch = (char)(s.charAt(i));
			}
		ans+= ch;
		}
	return ans;
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string ");
		String s1=sc.nextLine();
		System.out.println("Entered string by user is: "+s1);
		System.out.println("String in upper case letters is: "+printAgain(s1));
	}
}
