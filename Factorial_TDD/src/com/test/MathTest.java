package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import com.example.Math;;
public class MathTest {

	Math m;
	@Before
	public void setUp() throws Exception {
		m= new Math();
	}

	@Test
	public void whenNumIsZeroSystemShouldReturnOne() {
		assertEquals(1, m.getFactorial(0));
		
	}
     
	@Test
	public void whenNumIsOneSystemShouldReturnOne() {
		assertEquals(1, m.getFactorial(1));
	}
	
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void whenNumIsNegativeSystemShouldReturnException(){
		m.getFactorial(-4);
	}
	
	
}
