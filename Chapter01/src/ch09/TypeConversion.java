package ch09;

public class TypeConversion {

	public static void main(String[] args) {
		
		double dNum = 1.9;
		float fNum = 0.2f;
		
		int iNum1 = (int)dNum+(int)fNum;
		int iNum2 = (int)(dNum+fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
