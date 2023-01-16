class Wrapper2{
	public static void main(String[] args){
		float f = 3.14f;
		Float obj = new Float(f);
		System.out.println("Conversion from float to Float is: "+obj);
		System.out.println(obj.getClass());
		String str = Float.toString(f);
		System.out.println("Value in string from Float is: "+str);
		System.out.println(str.getClass());
		String str1 = "23.56";
		Float floatvalue = Float.valueOf(str1).floatValue();
		System.out.println("Converted float value is: "+floatvalue);
		String str3 = String.valueOf(f);
		System.out.println("float to String is: "+str3+" ,str3+90: "+str3+90);
		String str4 = "45.67";
		float obj2 = Float.parseFloat(str4);
		System.out.println("Converted Float value from String is: "+obj2);
		Float fObj = new Float("34.7845");
		float f1 = fObj.floatValue();
    		System.out.println("Value in float is: "+f1);
	}
}
