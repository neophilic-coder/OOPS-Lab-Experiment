import java.util.*;
class UserDefinedException extends Exception{
  public UserDefinedException(String str){
    super(str);
  }
}
public class Calc{
  static Double long_power(Double x, Double y){
    Double a = Math.pow(x,y);
    return a;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num 1: ");
    Double a = sc.nextDouble();
    System.out.println("Enter num 2: ");
    Double b = sc.nextDouble();
    try{
      if(a<0||b<0){
        throw new UserDefinedException("java.lang.exception,num1 and num2 should not be negative.");
      }
      else if(a==0||b==0){
        throw new UserDefinedException("java.lang.exception,num1 or num2 should not be zero");
      }
    }
    catch(UserDefinedException e){
      System.out.println(e.getMessage());
    }
    System.out.println("Code ends.");
  }
}
