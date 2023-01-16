class ABC1 implements Runnable{
  public void run(){
    System.out.println("runnable interface...");
  }
}
class ABC extends Thread{
  public void run(){
    System.out..println("thread class running...");
  }
  public static void main(String[] args){
    ABC obj1 = new ABC();
    obj1.start();
    ABC1 obj2 = new ABC1();
    Thread t1 = new Thread(obj2);
    t1.start();
  }
}
