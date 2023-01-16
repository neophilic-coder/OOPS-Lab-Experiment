class UpperCase{
	static String toUpper(String sb){
		String ans = " ";
		char ch = ' ';
		int len = sb.length();
		for(int i = 0;i< len;i++){
			if(sb.charAt(i)>='a' && sb.charAt(i)<='z'){
				ch = (char)(sb.charAt(i)-32);
			}
			else{
				ch=(char)(sb.charAt(i));
			}
		ans+= ch;
		}
	return ans;
	}
	public static void main(String[] args){
		System.out.println(toUpper("My name is Nandini Agarwal"));
	}
}
