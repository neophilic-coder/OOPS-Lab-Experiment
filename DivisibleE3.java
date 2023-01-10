public class Divisible{
	public static void main(String[] args){
		int i=0;
		int sum = 0;
		for(i=41;i<250;i++){
			if(i%5==0){
				System.out.println(i);
				sum = sum+i;
			}
		}
		System.out.println("The sum of numbers is: "+sum);
	}
}
