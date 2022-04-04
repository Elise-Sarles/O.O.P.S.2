import java.util.Scanner;
import java.util.InputMismatchException;
///Elise Sarles April 4 Reversing strings. 

public class Exercise18_9 {
	public static void main(String [] args ) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter a string");
		 
		 try {
			 String value = input.nextLine();
			 System.out.println("Reversed: ");
			 reverseDisplay(value);
			 
		 }catch(InputMismatchException ex) {
			 System.out.println(" Please try again.  Enter a string or a word.");
			 System.out.println("______________________");
			 main(args);
		 }
	}
	public static void reverseDisplay(String value) {
		/*
		String reverse = "";
		for (int i = value.length() - 1; i >= 0; i--) {
			reverse += value.charAt(i);
		}
		System.out.print(reverse);
		*/
		if (value.length() - 1 == 0) {
			System.out.print(value);
		}
		else {
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
		}
	}

}
