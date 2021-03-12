package com.epsi.mycal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 2;
		int b = 3;
		Calculator calculator = new Calculator();
		int actual = calculator.add(a, b);
		assertEquals(a + b, actual);
	}

	@Test
	public void testSub() {
		int a = 2;
		int b = 3;
		Calculator calculator = new Calculator();
		int actual = calculator.sub(a, b);
		assertEquals(a - b, actual);
	}

	@Test
	public void testMul() {
		int a = 2;
		int b = 3;
		Calculator calculator = new Calculator();
		int actual = calculator.mul(a, b);
		assertEquals(a * b, actual);
	}
	
	@Test
	public void testDiv() {
		int a = 6;
		int b = 3;
		
		Calculator calculator = new Calculator();
		int actual = calculator.div(a, b);
		assertEquals(a / b, actual);
	}
}
