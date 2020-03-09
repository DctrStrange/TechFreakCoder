
public class ExceptionHandlingTest {

	public static void main(String[] args) {
		int i=0,j=20;
		int[] b = new int[5];
		String testString = new String("Manash");
		String s = null;
		
		try {
			try {
				int k = j/i;
				System.out.println(k);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
				System.out.println("This is Arithmetic Exception Block");
			}
			
			try {
				b[5] = 6;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println("This is Array Out Of Bound Exception Block");
			}
			try {
				int m = Integer.parseInt(testString);
			}
			catch(NumberFormatException e){
				System.out.println(e);
				System.out.println("This is Number Format Exception Block");
			}
			System.out.println(s.length());
			System.out.println("This is Outer try Block");
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("This is finally Block");
		}
	}
}