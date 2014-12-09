
public class minOfThree {
	static int smallest(int x,int y,int z){
		if ((y/x)==0)  // Same as "if (y < x)"
	        return ((y/z)==0)? y : z;
	    return ((x/z)==0)? x : z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = 12, y = 15, z = 5;
		 System.out.println(smallest(x,y,z));
	}

}
