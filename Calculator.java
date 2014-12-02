public class Calculator {
	public static int add(int op1, int op2)
	{
		int value = op1 + op2;
		return value;
	}
	
	public static int subtract(int op1, int op2)
	{
		int value = op1 - op2;
		return value;
	}
	
	public static int multiply(int op1, int op2)
	{
		int value = op1 * op2;
		return value;
	}
	
	public static int divide(int op1, int op2)
	{
		int value = op1 / op2;
		return value;
	}
	public static int exponent(int op1, int op2)
	{
		double value = Math.pow(op1, op2);
		return (int) value;
	}
}
