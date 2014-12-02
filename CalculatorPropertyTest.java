import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;

public class CalculatorPropertyTest {

	@Test
	public void addTest() {
		Random rand = new Random();
		Integer a = rand.nextInt(2000)-1000;
		Integer b = rand.nextInt(2000)-1000;
		
		//1st property
		if(!(a.getClass().getName().equals("java.lang.Integer")))
		{
			fail("Operand of wrong type");
		}
		if(!(b.getClass().getName().equals("java.lang.Integer")))
		{
			fail("Operand of wrong type");
		}
		
		//2nd property
		assertTrue(a >= -2147483648 && a <= 2147483647);
		assertTrue(b >= -2147483648 && b <= 2147483647);
		
		//Run method, since properties 3-4 are based on output
		Integer result = Calculator.add(a, b);
		
		//3rd property
		assertTrue(result >= -2147483648 && result <= 2147483647);
		
		//4th property
		assertTrue(a + b == result);
		
	}
	@Test
	public void subTest() {
		Random rand = new Random();
		Integer a = rand.nextInt(2000)-1000;
		Integer b = rand.nextInt(2000)-1000;
		
		//1st property
		if(!(a.getClass().getName().equals("java.lang.Integer")))
		{
			fail("Operand of wrong type");
		}
		if(!(b.getClass().getName().equals("java.lang.Integer")))
		{
			fail("Operand of wrong type");
		}
		
		//2nd property
		assertTrue(a >= -2147483648 && a <= 2147483647);
		assertTrue(b >= -2147483648 && b <= 2147483647);
		
		//Run method, since properties 3-4 are based on output
		Integer result = Calculator.subtract(a, b);
		
		//3rd property
		assertTrue(result >= -2147483648 && result <= 2147483647);
		
		//4th property
		assertTrue(a - b == result);
	}
	
	@Test
	public void multTest() {
		Random rand = new Random();
		Integer a = rand.nextInt(2000)-1000;
		Integer b = rand.nextInt(2000)-1000;
		
		//1st property
		if(!(a.getClass().getName().equals("java.lang.Integer")))
		{
			fail("Operand of wrong type");
		}
		if(!(b.getClass().getName().equals("java.lang.Integer")))
		{
			fail("Operand of wrong type");
		}
		
		//2nd property
		assertTrue(a >= -2147483648 && a <= 2147483647);
		assertTrue(b >= -2147483648 && b <= 2147483647);
		
		//Run method, since properties 3-4 are based on output
		Integer result = Calculator.multiply(a, b);
		
		//3rd property
		assertTrue(result >= -2147483648 && result <= 2147483647);
		
		//4th property
		assertTrue(a * b == result);
	}
	
	@Test
	public void divTest() {
		Random rand = new Random();
		Integer a = rand.nextInt(2000)-1000;
		Integer b = rand.nextInt(2000)-1000;
		
		//1st property
		if(!(a.getClass().getName().equals("java.lang.Integer")))
		{
			fail("Operand of wrong type");
		}
		if(!(b.getClass().getName().equals("java.lang.Integer")))
		{
			fail("Operand of wrong type");
		}
		
		//2nd property
		assertTrue(a >= -2147483648 && a <= 2147483647);
		assertTrue(b >= -2147483648 && b <= 2147483647);
		
		//Run method, since properties 3-4 are based on output
		Integer result = Calculator.divide(a, b);
		
		//3rd property
		assertTrue(result >= -2147483648 && result <= 2147483647);
		
		//4th property
		assertTrue(a / b == result);
	}
	
	@Test
	public void expTest() {
		Random rand = new Random();
		Integer a = rand.nextInt(200)-100;
		Integer b = rand.nextInt(5);
		
		//1st property
		if(!(a.getClass().getName().equals("java.lang.Integer")))
		{
			fail("Operand of wrong type");
		}
		assertTrue(a < 101 && a > -101);
		
		//2nd property
		if(!(b.getClass().getName().equals("java.lang.Integer")))
		{
			fail("Operand of wrong type");
		}
		assertTrue(b <= 5 && b >= 0);
		
		//Run method, since properties 3-4 are based on output
		Integer result = Calculator.exponent(a, b);
		
		//3rd property
		assertTrue(result >= -2147483648 && result <= 2147483647);
		
		//4th property
		assertTrue(Math.pow(a,b) == result);
	}

}
