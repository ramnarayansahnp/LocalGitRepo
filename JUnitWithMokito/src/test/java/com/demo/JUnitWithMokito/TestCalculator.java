 package com.demo.JUnitWithMokito;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestCalculator  
{
	Calculator c=null;
	
	@Before
	public void setUp()
	{
		c=new Calculator();
	}
	
	@After
	public void tearDown()
	{
		System.out.println("After the method..");
	}
	
	@Test
    public void testAdd()
	{
		assertEquals(5,c.add(2, 3));
	}
  
}
