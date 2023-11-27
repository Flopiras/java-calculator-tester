package org.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator c;
	
	@BeforeEach
	public void setup () {
		
		c = new Calculator();
	}
	
	@Test
	public void goodDataGetAddTest() {
		
		final float SUM = 3;
		
		assertEquals(SUM, c.add(1,2));
	}
	
	@Test
	public void goodDataGetSubtractTest() {
		
		final float SUBTRACT = 1;
		
		assertEquals(SUBTRACT, c.subtract(2,1));
	}
	
	@Test
	public void goodDataGetDivideTest() throws Exception {
		
		final float DIVIDE = 2;
		
		assertEquals(DIVIDE, c.divide(6,3));
	}
	
	@Test
	public void getDivideZeroTest() throws Exception {
		
		assertThrows(Exception.class, () -> c.divide(2, 0), "You can't divide for zero");
	}
	
	@Test
	public void goodDataGetMultiplyTest() {
		
		final float MULTIPLY = 42;
		
		assertEquals(MULTIPLY, c.multiply(6,7));
	}

}
