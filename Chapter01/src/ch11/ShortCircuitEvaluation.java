package ch11;

public class ShortCircuitEvaluation {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value;
		value = ((num1 += 10 ) < 10) && ((i+=2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 += 10 ) < 10) || ((i+=2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
