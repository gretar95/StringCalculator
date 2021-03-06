package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest{

	@Test
	public void testEmptyString(){
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void testOneNumber(){
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void testTwoNumbers(){
		assertEquals(3, StringCalculator.add("1,2"));
	}

	@Test
	public void testMultipleNumbers(){
		assertEquals(10, StringCalculator.add("1,2,3,4"));
	}

	@Test
	public void testNewLineAndComma(){
		assertEquals(6, StringCalculator.add("1,2\n3"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void ExceptionWithNegativeNumbers(){
		StringCalculator.add("-1,2,-3,4,-5");
	}

	@Test
	public void testBiggerThan1K(){
		assertEquals(2, StringCalculator.add("1001,2"));
	}

	@Test
	public void testSomeDelimeters(){
		assertEquals(11, StringCalculator.add("//!,1,2,3!5"));
	}

}