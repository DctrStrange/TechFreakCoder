import java.lang.String;
import java.util.Scanner;
import java.lang.Exception;

public class SubString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String testString1 = new String(scan.nextLine());
		
		System.out.print("Enter First Position: ");
		int firstPosition = scan.nextInt();
		System.out.print("Enter Last Position: ");
		int lastPosition = scan.nextInt();
		
		print(firstPosition, lastPosition, testString1);
	}
	
	static void print(int firstPosition, int lastPosition, String localTestString1) {
		System.out.print("The Desired SubString is: ");
		
		try {
			for(int index = firstPosition;index <= lastPosition;index++) {
				System.out.print(localTestString1.charAt(index));
			}
		}
		catch(StringIndexOutOfBoundsException exception) {
			System.out.println("Index of String is either Negative or Greater than the length of the Given String");
		}
	}
}
