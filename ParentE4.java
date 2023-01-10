class Parent{
	private int i = 10;
	static String ch = "Hello";
}

class Priavte extends Parent{
	int h = 20;
	void p(){
		System.out.println("Code using inheritence.");
	}
	public static void main(String args[]){
		Priavte obj = new Priavte();
		obj.i=20;
	}
}
