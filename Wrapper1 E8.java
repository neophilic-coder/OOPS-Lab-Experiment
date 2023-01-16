class Wrapper1{
	public static void main(String[] args){
		int a =10;
		Integer i = Integer.valueOf(a);
		System.out.println("int to Integer i = "+i);
		System.out.println(i.getClass());
		String str1 = String.valueOf(8712);
		System.out.println("Integer to String str1 = "+str1);
		System.out.println(str1.getClass());
		String sti = "1234";
		int value=0;
		value= Integer.parseInt(sti);
		sti=sti+56;
		System.out.println("'+' operator in string works as sti+56: "+sti);
		System.out.println("Conversion from String to int: "+value);
		value=value+56;
		System.out.println("'+' operator in int works as value+56: "+value);
		int num = 2002;
		String str2 = Integer.toString(num);
		System.out.println("Conversion from int to String successful.\nThe class to which it belongs now is: "+str2.getClass());
		int num1 = Integer.parseInt(str2);
		str2 = str2+90;
		System.out.println("Value of converted Integer is: "+num1);
		num1=num1+90;
		System.out.println("str2 = "+str2+"  and num1= "+num1);
		Integer p = new Integer("90");
		System.out.println("Integer value is= "+p);
		int b= Integer.parseInt(p.toString());
		System.out.println("int value is = "+b);
	}
}
