package new;

public class A {
		void p() {
			System.out.println("This is default method.");
		}
		public void q() {
			System.out.println("This is public method.");
		}
		private void r() {
			System.out.println("This is private method.");
		}
		protected void s() {
			System.out.println("This is protected method.");
		}
}

package new1;
import learn.*;
public class B extends A{
	public static void main(String[] args) {
		A obj = new A();
		B b = new B();
		obj.p();
		obj.q();
		obj.r();
		obj.s();
	}
}
