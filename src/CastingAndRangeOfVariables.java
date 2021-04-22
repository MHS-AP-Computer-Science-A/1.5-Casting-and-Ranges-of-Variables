
public class CastingAndRangeOfVariables {
	public static void main(String[] args) {
		
		int x = 7;
		
		//The value 7 is implicitly cast to a double
		double y = x;
		
		//Explicit casting
		double a = 7.0;
		int b = (int)a;
		
		double students = 30;
		double cookies = 256;
						      //(int)8.53333
		int cookiesPerStudent = (int)(cookies / students);
		
		double num = 2.1;
		int rounded = (int)(num + 0.5);
		
		double num2 = 2.8;
		int rounded2 = (int)(num + 0.5);
		
		char letter = 'A';
		
		//Accessing the minimum and maximum int values
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		System.out.println(min + max);
		
		
	}
}
