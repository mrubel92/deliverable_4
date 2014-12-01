import junit.framework.TestCase;


public class CalculatorTest extends TestCase {
	public void testSingleFunction()
	{
		//Each standalone test
		assertTrue("Test add", 4 == Calculator.add(3, 1));
		assertTrue("Test subtract", 2 == Calculator.subtract(4, 2));
		assertTrue("Test multiply", 80 == Calculator.multiply(8, 10));
		assertTrue("Test divide", 2 == Calculator.divide(8, 4));
		assertTrue("Test exponents", 64 == Calculator.exponent(2, 6));
	}
	public void testDoubleFunction()
	{
		//Each 2-function test
		assertTrue("Test add/subtract", 1 == Calculator.add(3, Calculator.subtract(2, 4)));
		assertTrue("Test add/multiply", 29 == Calculator.add(5, Calculator.multiply(6, 4)));
		assertTrue("Test add/divide", 4 == Calculator.add(1, Calculator.divide(18, 6)));
		assertTrue("Test add/exponent", 76 == Calculator.add(12, Calculator.exponent(4, 3)));
		
		assertTrue("Test subtract/multiply", 8 == Calculator.subtract(12, Calculator.multiply(4, 1)));
		assertTrue("Test subtract/divide", 15 == Calculator.subtract(19, Calculator.divide(12, 3)));
		assertTrue("Test subtract/exponent", -613 == Calculator.subtract(12, Calculator.exponent(5, 4)));
		
		assertTrue("Test multiply/divide", 24 == Calculator.multiply(3, Calculator.divide(16, 2)));
		assertTrue("Test multiply/exponent", 5000 == Calculator.multiply(5, Calculator.exponent(10, 3)));
		
		assertTrue("Test divide/exponent", 7 == Calculator.divide(343, Calculator.exponent(7, 2)));
	}
	public void testTripleFunction()
	{
		//Each 3-function test
		assertTrue("Test add/subtract/multiply", -1 == Calculator.add(3, Calculator.subtract(2, Calculator.multiply(3, 2))));
		assertTrue("Test add/subtract/divide", 33 == Calculator.add(5, Calculator.subtract(31, Calculator.divide(6, 2))));
		assertTrue("Test add/subtract/exponent", 1 == Calculator.add(1, Calculator.subtract(9, Calculator.exponent(3, 2))));
		
		assertTrue("Test add/multiply/divide", 13 == Calculator.add(3, Calculator.multiply(2, Calculator.divide(20, 4))));
		assertTrue("Test add/multiply/exponent", 50428 == Calculator.add(7, Calculator.multiply(3, Calculator.exponent(7, 5))));
		
		assertTrue("Test add/divide/exponent", 22 == Calculator.add(14, Calculator.divide(648, Calculator.exponent(3, 4))));
		
		assertTrue("Test subtract/multiply/divide", 3 == Calculator.subtract(103, Calculator.multiply(5, Calculator.divide(100, 5))));
		assertTrue("Test subtract/multiply/exponent", -26618 == Calculator.subtract(382, Calculator.multiply(8, Calculator.exponent(15, 3))));
		
		assertTrue("Test subtract/divide/exponent", 59 == Calculator.subtract(61, Calculator.divide(288, Calculator.exponent(12, 2))));
		
		assertTrue("Test multiply/divide/exponent", 21 == Calculator.multiply(7, Calculator.divide(2187, Calculator.exponent(9, 3))));
	}
	public void testQuadFunction()
	{
		//Each 4-way function test
		assertTrue("Test add/subtract/multiply/divide", 20 == Calculator.add(27, Calculator.subtract(3, Calculator.multiply(5, Calculator.divide(2, 1)))));
		assertTrue("Test add/subtract/multiply/exponent", 105 == Calculator.add(21, Calculator.subtract(219, Calculator.multiply(5, Calculator.exponent(3, 3)))));
		assertTrue("Test add/subtract/divide/exponent", 45 == Calculator.add(27, Calculator.subtract(38, Calculator.divide(120, Calculator.exponent(6, 1)))));
		assertTrue("Test add/multiply/divide/exponent", 585 == Calculator.add(91, Calculator.multiply(38, Calculator.divide(325, Calculator.exponent(5, 2)))));
		assertTrue("Test subtract/multiply/divide/exponent", -27 == Calculator.subtract(5, Calculator.multiply(4, Calculator.divide(4096, Calculator.exponent(8, 3)))));
	}
	public void testQuintFunction()
	{
		//All 5 functions test
		assertTrue("Test add/subtract/multiply/divide/exponent", 114 == Calculator.add(67, Calculator.subtract(82, Calculator.multiply(5, Calculator.divide(1512, Calculator.exponent(6, 3))))));
	}
}
