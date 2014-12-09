
public class nextPow2 {
	static void fun(int n){
		int pos=(int) Math.ceil(Math.log10(n)/Math.log10(2));
		System.out.println(pos);
		int p=(int) Math.pow(2, pos);
		System.out.println(p);
	}
	
	public static void main(String[] args){
		int n=17;
		fun(n);
	}
}
