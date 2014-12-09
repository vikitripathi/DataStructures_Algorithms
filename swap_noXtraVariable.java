/*
 Logic--->
 Works on this logic:
(A XOR B) XOR B = A
(A XOR B) XOR A = B

 --------------
 
 XOR is a great way to combine information and later extract it. XOR-based encryption uses this technique. 
 Also, XOR can combine N items together, not just 2.
 
x1 = x xor y
y1 = x1 xor y
x2 = x1 xor y1

x2 = x1 xor y1
x2 = x1 xor (x1 xor y)   // replace y1
x2 = (x1 xor x1) xor y   // regroup parenthesis - order does not matter for XOR
x2 = 0 xor y             // a xor a => 0
x2 = y                   // 0 xor a => a; x2 now has y's original value

y1 = x1 xor y
y1 = (x xor y) xor y
y1 = x xor (y xor y)
y1 = x xor 0
y1 = x                  // y1 == x's original value 


A Problem--->
------------------

Suppose x and y are pointers or references to objects, and both point to the same location.
 We’d expect our swapping function to just switch the values around, with no net change, right?
 Well, take a look at what happens if we expand out line 1:
x = x xor y
x = x xor x  // x and y are equal
x = 0
Wow! So x becomes 0 right at the get-go
but because x and y are at the same location, we just made y zero as well! We’ve lost the original values, a problem known as aliasing: 

^ ALIASING
 aliasing describes a situation in which a data location in memory can be accessed through different symbolic names in the program. 
 Thus, modifying the data through one name implicitly modifies the values associated with all aliased names, which may not be expected by the programmer.



 CPU-Level details--->
 -----------------------
The computer actually has an implicit “temp” variable that stores intermediate results before writing them back to a register. For example, if you add 3 to a
 register (in machine-language pseudocode):

ADD 3 A  // add 3 to register A

The ALU (Arithmetic Logic Unit) is actually what executes the instruction 3+A. It takes the inputs (3,A) and creates a result (3 + A), which the CPU then stores back 
into A’s original register. So, we used the ALU as temporary scratch space before we had the final answer.

We take the ALU’s implicit temporary data for granted, but it’s always there. In a similar way, the ALU can return the intermediate result of the XOR in the case 
of x = x xor y, at which point the CPU stores it into x’s original register.
 
  
 */

public class swap_noXtraVariable {
	
	static void swap(int x,int y)
	{
		x=x ^ y;
		y=x ^ y;
		x=x ^ y;
		System.out.println(x+"--"+y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=20;
		System.out.println(x+"--"+y);
		swap(x,y);

	}

}

/*
 other strategies
 -----------------
  int x = 10, y = 5;
 
  // Code to swap 'x' and 'y'
  x = x + y;  // x now becomes 15
  y = x - y;  // y becomes 10
  x = x - y;  // x becomes 5
 
 
 
 ----------------------
 int x = 10, y = 5;
 
  // Code to swap 'x' and 'y'
  x = x * y;  // x now becomes 50
  y = x / y;  // y becomes 10
  x = x / y;  // x becomes 5
 
 */

/*
 PROBLEM->
 -----------
 
 Problems with above methods
1) The multiplication and division based approach doesn’ work if one of the numbers is 0 as the product becomes 0 irrespective of the other number.

2) Both Arithmetic solutions may cause arithmetic overflow. If x and y are too large, addition and multiplication may go out of integer range.

3) When we use pointers to variable and make a function swap, all of the above methods fail when both pointers point to the same variable. Let’s take a 
   look what will happen in this case if both are pointing to the same variable.
 
 */

