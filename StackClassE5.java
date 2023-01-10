import java.util.Scanner;

interface StackInterface{
	void push(int element);
	int pop();
	void display();
}
public class StackClass implements StackInterface{
	int[] s = new int[10];
	int top = -1;
	public void push(int element){
		if(this.top ==s.length-1){
			System.out.println("Stack Overflow!");
		}
		else{
			top++;
			s[top]=element;
		}
		System.out.println("The pushed element is: "+element +" at an index "+top);
		
	}
	public int pop(){
		if(top==-1){
			System.out.println("Stack Underflow!");
		}
		else{
			System.out.println("The popped element is: "+s[top]);
			top--;
		}
	return s[top--];
	}
	public void display(){
		if(top>=0){
			System.out.println("Elements in the stack are: ");
			for(int i=top;i>=0;i--){
				System.out.println(s[i]+ " ");
			}
		}
		else{
			System.out.println("The stack is empty.");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StackInterface obj = new Functions();
		boolean b = true;
		while(b == true){
			System.out.println("Functions performed are: ");
			System.out.println("Enter 1 for Push.");
			System.out.println("Enter 2 for Pop.");
			System.out.println("Enter 3 for Display."); 
			System.out.println("Enter 4 for Exit.");
			System.out.println("Enter your choice among them: ");
			int a = sc.nextInt();
			switch(a){
				case 1:
					System.out.print("Enter the element you wish to push: ");
					int element = sc.nextInt();
					obj.push(element);
					break;
				case 2:
					System.out.println(obj.pop());
					break;
				case 3:
					obj.display();
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Enter valid number");
					break;	
				}
		}
		System.out.print("Enter your choice again: (true or false) ");
		b = sc.nextBoolean();
	}
	//sc.close();
}
