
public class passByReference {
	public int toy=10;
	
	void play(passByReference toy){  
	    System.out.println("Toy number in play " + toy.toy);   
	    toy.toy++;  
	    System.out.println("Toy number in play after increement " + toy.toy);   
	}
	static void play(int[] a){
		System.out.println(a[0]+"from function before change");
		a[0]++;
		System.out.println(a[0]+"from function after change");
	}	
	public static void main(String[] args){
		int n=10;
		int[] a =new int[1];
		a[0]=n;
		System.out.println(a[0]+"from main before function");
		play(a);//because arrays are passed by reference in java
		System.out.println(a[0]+"from function after function");
		
		System.out.println("------- Use of Object -----------");
		passByReference m=new passByReference();
		System.out.println("Toy number in play before passing " + m.toy); 
		m.play(m);
		System.out.println("Toy number in play after passing " + m.toy); 
	}
}
