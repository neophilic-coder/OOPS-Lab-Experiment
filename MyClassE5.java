interface A{
  void meth1();
  void meth2();
}
class MyClass implements A{
    public void meth1(){
      System.out.println(" Meth1 says Hello");
    }
    public void meth2(){
      System.out.println("Meth2 says Hii");
    }
    public static void main(String[] args){
    MyClass m = new MyClass();
    m.meth1();
    m.meth2();
  }
}
