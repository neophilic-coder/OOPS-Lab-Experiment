package mypack;
public class NewPackage6_1{
  public void name();
}

package pack;
import mypack.*;
public class Package6_1{
    public void name(){
            System.out.println("My name is Nandini Agarwal.");
    }

    public static void main(String args[])
    {
        NewPackage6_1 obj = new NewPackage6_1();
        obj.name();
    }
}
