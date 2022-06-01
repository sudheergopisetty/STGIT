package junitcom.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSaHello() {
		calculator calculator = new calculator();
		
		assertEquals("welcome", calculator.saHello("launch"));
	
	}

}
