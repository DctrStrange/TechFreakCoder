
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
			}
			
			try {
				b[5] = 6;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			try {
				int m = Integer.parseInt(testString);
			}
			catch(NumberFormatException e){
				System.out.println(e);
			}
			try {
				System.out.println(s.length());
			}
			catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}