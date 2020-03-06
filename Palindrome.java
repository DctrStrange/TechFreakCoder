import java.lang.StringBuilder;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str;
		StringBuilder strb = new StringBuilder(scan.nextLine());
		strb.reverse();
		str = strb.toString();
		strb.reverse();
		StringBuilder rStrb = new StringBuilder(str);
		
		if(strb.toString().equals(rStrb.toString())) {
			System.out.println("The String is Palindrome.");
		}
		else {
			System.out.println("The String is Not Palindrome.");
		}
	}

}
