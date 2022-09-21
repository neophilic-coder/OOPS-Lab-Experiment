import java.util.Scanner;
public class Calculator{
  public static void main(String[] args){
      double n1,n2,result;
      char op;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two numbers: ");
      n1 = sc.nextDouble();
      n2 = sc.nextDouble();
      System.out.println("Enter an operator among'+,-,/,*': ");
      op = sc,next().charAt(0);
      switch(op){
        case '+':
          result = n1+n2;
          break;
        case '-':
          result = n1-n2;
          break;
        case '*':
          result = n1*n2;
          break;
        case '/':
          result = n1/n2;
          break;
        default:
          System.out.println("Enter valid operator");
          break;
      }
      System.out.println("The result of calculation is: ");
      System.out.printf(n1+ " "+op+" "+n2+" = "+result);
    }
}
