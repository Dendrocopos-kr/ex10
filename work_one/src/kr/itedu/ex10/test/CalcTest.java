package kr.itedu.ex10.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import kr.itedu.ex10.Calc;

class CalcTest {
	private int n1, n2, sum;

	@BeforeEach
	void init() {
		n1 = (int)(Math.random()*1000);
		n2 = (int)(Math.random()*1000);
		sum = n1 + n2;
	}
	
	@RepeatedTest(value = 1000)
	void test() {
		assertEquals(Calc.sum(n1, n2),sum);
	}
}
