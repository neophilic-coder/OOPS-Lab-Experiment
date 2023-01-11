class LessThan extends Exception{
  public LessThan(String str){
    super(str);
  }
}
class TestCustomException{
  static void validate(int num) throws LessThan{
    if (num<500){
      throw new LessThan("Number less than 500");
    }
    else{
      System.out.println("Number is greater than 500");
    }
  }
  public static void main(String[] args){
    try{
      validate(40);
    }
    catch(LessThan le){
      System.out.println("Exception caught...");
      System.out.println(le);
    }
    System.out.println("Code ends.");
  }
}
