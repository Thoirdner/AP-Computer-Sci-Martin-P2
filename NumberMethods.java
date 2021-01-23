package InClass;
//This project was created by the dual efforts of Connor Horstman and Nick Lacy.

public class NumberMethods {
	
	public static boolean isPrime(int num) {
		boolean prime = true;
		for (int i = 2; i <= num / 2; i++) {
			if(num % i ==0) {
				prime = false;
			}
		}
		//num is > 1
		//This method should set prime true if num is prime.
		//This method should set prime false if num is composite.
		//This method should return isPrime;
		//will need loop
		
		
		return prime;
	}
	
	public static int divisorSum(int num) {
		int sum = 0;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				if (i == (num / i)) {
					sum += i;
				}
				else {
					sum += (i + num / i);
				}
			}
		}
		/*
		This method should return the sum of all of the divisors of n
		if divisorSum(8) is called, a value of 7 should be returned because
		the proper divisors of 8 are 1, 2, and 4.
		*/
		
		return (sum + 1);
	}
	
	public static int numDivisors(int num) {
		int count = 0;
		for (int i=1; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
			
		}
		return count;	
	}
	
	public static boolean isStrong(int num) {
		boolean strong = false;
		if (divisorSum(num) < num) {
			if(isPrime(num) != true) {
				if (numDivisors(num) != 1) {
					strong = true;
				}
			}
		}
		
		/*
		 A number is considered strong if it is:
		 1) Greater than the sum of its divisors
		 2) A composite number
		 */
		
		/*
		 A number is considered weak if it is:
		 1) Less than the sum of its divisors
		 2) A composite number
		 */
		
		/*
		 * This method should check if n is strong.
		 * The call isStrong(8) should return true because 8 > (1 + 2 + 4) = 7
		 * The call isStrong(12) should return false because 12 < (1 + 2 + 3 + 4 + 6) = 16
		 */
		
		//This method MUST use the divisorSum and isPrime method
		
		return strong;
	}
	
	public static void printDivisors(int num) {
		 /*
		 This method should print the divisors of n (not including n)
		 on a single line.
		 If printDivisors(12) is called, 1 2 3 4 6		should be printed.
		 */
		System.out.print("1 ");
		for (int i = 2; i <= num; i++) {
			if ( num % i == 0) {
				if ( num > i) {
					System.out.print( + i + " ");
				}
			}
		}
		System.out.println();
	}
	
	public static void printPrimes(int num) {
		//This method prints all prime numbers less than n on a single line
		//The call printPrimes(30) should print 2 3 5 7 11 13 17 19 23 29
		//This method MUST use the isPrime method
		for (int i = 2; i < num; i++) {
			if (isPrime(i) == true) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void printComposites(int num) {
		//This method prints all composite numbers less than n on a single line
		//The call printComposites(30) should print 4 6 8 9 10 12 14 15 16 18 20 21 22 24 25 26 27 28 
		//This method MUST use the isPrime method
		//hint opposite of printPrime
		for (int i = 1; i < num; i++) {
			if (isPrime(i) == false) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void printStrong(int num) {
		//This method prints all the strong numbers less than n on a single line
		//The call printStrong(30) should print 4 8 9 10 14 15 16 21 22
		//This method MUST use the isStrong method
		for (int i = 1; i < num; i++) {
			if (isStrong(i) == true) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void printWeak(int num) {
		//This method prints all the weak numbers less than n on a single line
		//The call printWeak(30) should print 6 12 18 20 24 28
		//This method MUST use the isStrong method
		for (int i = 1; i < num; i++) {
			if(numDivisors(i) > 2) {
				if (isStrong(i) == false) {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println();
	}
	
	
	public static int sum(int num) {
		//n = 5
		int sum = 0;
		for (int i = 1; i < num; i++ ) {
			sum = sum +i;
			//iter1 = sum 0 + 1 = 1
			//iter2 = sum 1 + 2 = 3
			//iter3 = sum 3 + 3 = 6
			//iter4 = sum 6 + 4 = 10
			
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		//printComposites(30);
		//printPrimes(30);
		//printStrong(30);
		//printWeak(30);
		//System.out.println(sum(5));
		//System.out.println(isPrime(12));
		//System.out.println(divisorSum(2));
		//System.out.println(isStrong(26));
		//printDivisors(25);
		//System.out.println(numDivisors(29));
		printPrimes(30);
		printComposites(30);
		printStrong(30);
		printWeak(30);
	}

}

