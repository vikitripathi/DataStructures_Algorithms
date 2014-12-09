public class addNumber {
	static void add(int a,int b){
		System.out.println(2*(a & b)+(a ^ b));//based on the idea of half adder, sum = 2C+S ,check wiki of half adder
	}
	/*
	 Sum of two bits can be obtained by performing XOR (^) of the two bits. 
	 Carry bit can be obtained by performing AND (&) of two bits.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=3;
		add(a,b);
	}

}
