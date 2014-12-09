/*
 The sign bit is 1 in negative numbers, and 0 in positive numbers. The XOR of x and y will have the sign bit as 1 iff they have opposite sign.
  In other words, XOR of x and y will be negative number number iff x and y have opposite signs.
 */
public class opposite_signInteger {
	static void oppositeSign(int x, int y){
		System.out.println((x^y)<0);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=9,y=-19;
		oppositeSign(x,y);

	}

}
