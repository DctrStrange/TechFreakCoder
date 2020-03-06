import java.util.Scanner;

public class SecondHighest {
	
	public static void main(String[] args) {
		int[] arrayOfNumbers = new int[10];
		int number, index;
		Scanner scan = new Scanner(System.in);
		
		for(index=0;index<10;index++) {
			System.out.print("Enter a Number: ");
			number = scan.nextInt();
			arrayOfNumbers[index] = number;
		}
		
		for(index=0;index<9;index++) {
			for(number=index+1;number<10;number++) {
				if(arrayOfNumbers[index]>arrayOfNumbers[number]) {
					int temp = arrayOfNumbers[index];
					arrayOfNumbers[index] = arrayOfNumbers[number];
					arrayOfNumbers[number] = temp;
				}
			}
		}
		
		index = arrayOfNumbers.length;
		System.out.println("2nd Highest Number is: " + arrayOfNumbers[index-2]);
	}

}
