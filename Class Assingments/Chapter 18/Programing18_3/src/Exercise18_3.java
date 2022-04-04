import java.util.Scanner;
import java.util.InputMismatchException;
public class Exercise18_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Greatest Common Divisor \nEnter two numbers");
		try {
		int m = input.nextInt();
		int n = input.nextInt();
		
		System.out.println("The greatest common divisor of "+ m + " and "+ n + " is " + gcd(m,n));
	
		} catch(InputMismatchException ex){
			System.out.println("Please Try again. Enter Integers");
			System.out.println("_________________________");
			  main(args);
		}
	}
	public static int gcd(int m, int n) {
		if(m%n == 0) {
			return n;
		}
		else {
			return gcd(n,m%n); 
		}
	}

}
