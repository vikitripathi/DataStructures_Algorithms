/*
 For any number, we can check whether its ‘i’th bit is 0(OFF) or 1(ON) by bitwise ANDing it with “2^i” (2 raise to i).

1) Let us take number 'NUM' and we want to check whether it's 0th bit is ON or OFF	
	bit = 2 ^ 0 (0th bit)
	if  NUM & bit == 1 means 0th bit is ON else 0th bit is OFF

2) Similarly if we want to check whether 5th bit is ON or OFF	
	bit = 2 ^ 5 (5th bit)
	if NUM & bit == 1 means its 5th bit is ON else 5th bit is OFF.
 */
import java.math.*;
public class binary {
	static int ipow(int base, int exp)
	{
		int result = 1;
		for (int i = 1; i <= exp; i++) {
		   result *= base;
		}
		return result;
		//use of rigth shift operator
	}
	static void binary(int n,int j){
		for(int i=0;i<j;i++){
			if((n & ipow(2,i))==1)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
	static void BINARY(int n){
		//use array and modulus 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8,i=0;
		while(n>=Math.pow(2,i)){//2^i prints something else
			i=i+1;
		}
		//unsigned no Check 
		System.out.println(ipow(2,3) & n);
		//binary(n,i);
		BINARY(8);

	}

}
