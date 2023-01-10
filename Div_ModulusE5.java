interface Methods{
	void division();
	void modulus();
}
class Divisions implements Methods{
	public void division(){
		int a = 9;
		int b = 3;
		System.out.println("Division is: "+(a/b));
	}
	public void modulus(){
		int a = 9;
		int b = 3;
		System.out.println("Modulus of numbers is: "+(a%b));
	}
}

class Interface1{
	public static void main(String[] args){
		Methods obj = new Divisions();
		obj.division();
		obj.modulus();
	}
}
