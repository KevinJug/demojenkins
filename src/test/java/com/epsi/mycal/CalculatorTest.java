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
  public void testDiv() throws Exception {
    int a = 6;
    int b = 3;
    Calculator calculator = new Calculator();
    int actual = calculator.div(a, b);
    assertEquals(a / b, actual);
  }
  
  @Test(expected = java.lang.Exception.class)
  public void testDiv0() throws Exception {
    int a = 6;
    int b = 0;
    Calculator calculator = new Calculator();
    calculator.div(a, b);
  }
  
  @Test
  public void testPair() {
    int a = 6;
    int b = 7;
    Calculator calculator = new Calculator();
    boolean actualA = calculator.pair(a);
    assertTrue(actualA);
    boolean actualB = calculator.pair(b);
    assertFalse(actualB);
  }
  
  @Test
  public void testFirst() {
    int a = 1;
    int b = 3;
    int c = 4;
    Calculator calculator = new Calculator();
    boolean actualA = calculator.first(a);
    assertFalse(actualA);
    boolean actualB = calculator.first(b);
    assertTrue(actualB);
    boolean actualC = calculator.first(c);
    assertFalse(actualC);
  }
  
}
