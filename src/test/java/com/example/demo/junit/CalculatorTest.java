package com.example.demo.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void divideで3と2の除算結果が取得できる() throws Exception {
		assertThat(Calculator.divide(3, 2), is(1.5));
	}

	@Test
	public void divideで17と3の除算結果が取得できる() throws Exception {
		assertThat(Calculator.divide(17, 2), is(8.5));		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void divideで5と0のときIllegalArgumentExceptionを送出する() {
		Calculator.divide(5, 0);
	}
}
