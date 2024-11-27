// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {

		int x1 = Integer.parseInt(args [0]);
		int x2 = Integer.parseInt(args[1]);
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	
	public static int plus(int x1, int x2) {

	while (x2 != 0) {
		if (x2 > 0){
		x1++;
		x2--;
	}else{
		x1--;
		x2++;
	}
}

		return x1;
	
}


	// Returns x1 - x2
	public static int minus (int x1, int x2) {
		while (x2 != 0){

			if (x2 > 0){
			x1--;
			x2--;
	}else{ 
			x1++;
			x2++;
	}
	}
	return x1;
}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int resultOfTimes = 0;
		boolean isNegative = false;

			if (x1 == 0 || x2 == 0){
			return 0;
			}
			if (x1 == 1) {
				return x2;
			}if (x2 ==1){
				return x1;
				
			}

			else if ( x1 < 0 && x2 > 0 || x1 > 0 && x2 < 0){
				isNegative = true;
			}

			x1 = x1 < 0 ? minus(0, x1) : x1;
			x2 = x2 < 0 ? minus(0, x2) : x2;



			while (x2 > 0) {
			resultOfTimes =  plus(resultOfTimes,x1);
			x2--;

			}if (isNegative) {
				resultOfTimes = minus(0, resultOfTimes);
				
			}
			
	
		return resultOfTimes;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int resultOfPow = 1;

		if (n == 0){
			return 1;
		}

		while (n > 0) {
		resultOfPow = times(resultOfPow , x);
			n--;
			
		}
		

		return resultOfPow;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int resultOfDiv = 0;
		boolean isNegative = false;

		if (x2 == 0){
			return 0;
		
		}else if  ( x1 < 0 && x2 >0 || x1 > 0 && x2 < 0){
			isNegative = true;	
		}

		x1 = x1 < 0 ? minus(0, x1) : x1;
		x2 = x2 < 0 ? minus(0, x2) : x2;

		while (x1 >= x2){
			x1 = minus(x1, x2);
			resultOfDiv = plus(resultOfDiv, 1);			
		}

		if (isNegative){
			resultOfDiv = minus(0, resultOfDiv);
		}
		
		
		return resultOfDiv;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2){

		if (x1 < x2){
			return x1;
		}
		
		int resultOfMod = minus(x1,times(div(x1, x2), x2));
		
		if (resultOfMod < 0 ){
			resultOfMod = plus(resultOfMod, x2);
	
		}
			
			
		return resultOfMod;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int resultOfSqrt = 0;
		int y = 0;
		while (pow(y, 2) <= x) {
			resultOfSqrt = y;
			y =  plus(y, 1);
		}

		return resultOfSqrt;
	}	  	  
}