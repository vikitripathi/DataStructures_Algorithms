/*
 * Reverse String using XOR and without using Temporary Variable
 */
public class reverseString_noXtraVarialbe {
	static void reverse(char[] s){
		System.out.println(s);
		int ends=s.length-1;
		int starts=0;
		while(starts<ends){
			s[starts]^=s[ends];
			s[ends]^=s[starts];
			s[starts]^=s[ends];	
			starts++;
			ends--;
		}
		System.out.println(s);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s[]={'a','b','c','d','e','f'};
		reverse(s);

	}

}
