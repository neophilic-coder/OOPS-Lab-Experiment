import java.util.Scanner;

public class StringObjects{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String name1 = sc.next();
	int len=  name1.length();
	int freq=0;
	char string[] = name1.toCharArray();
	System.out.println("Length of name is: "+len);
	for(int i =0;i<len;i++){
		if(name1.charAt(i) == 'a' || name1.charAt(i)=='A'){
			System.out.println("Character 'a' is present");
			freq++;
		}
		else{
			System.out.println("Character 'a' is not present");
		}
	}
	System.out.println("Frequency of occurrence of 'a': "+freq);
	}
}
	