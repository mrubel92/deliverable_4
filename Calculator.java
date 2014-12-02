public class Calculator {
	public static Integer add(Integer op1, Integer op2)
	{
		Integer value = new Integer(op1 + op2);
		return value;
	}
	
	public static Integer subtract(Integer op1, Integer op2)
	{
		Integer value = new Integer(op1 - op2);
		return value;
	}
	
	public static Integer multiply(Integer op1, Integer op2)
	{
		Integer value = op1 * op2;
		return value;
	}
	
	public static Integer divide(Integer op1, Integer op2)
	{
		Integer value = op1 / op2;
		return value;
	}
	public static Integer exponent(Integer op1, Integer op2)
	{
		double value = Math.pow(op1, op2);
		Integer retVal = new Integer((int) value);
		return retVal;
	}
}
