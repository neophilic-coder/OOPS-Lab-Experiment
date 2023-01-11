import java.util.*;
public class BitSigned{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    try{
      System.out.println("Enter num1:");
      int a = sc.nextInt();
      System.out.println("Enter num2:");
      int b = sc.nextInt();
      int c= a/b;
      System.out.println("Division is: "+c);
    }
    catch(ArithmeticException e){
      System.out.println(e);
    }
    catch(InputMismatchException me){
      System.out.println(me);
    }
    System.out.println("Code ends");
  }
}
