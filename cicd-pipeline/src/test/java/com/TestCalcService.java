package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.CalcService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalcService {

	@Test
	public void sumTest() {
		int a = 12;
		int b = 32;
		CalcService cs = new CalcService();
		System.out.println("Testing Sum");
		Assertions.assertEquals(cs.sum(12, 32), 44);
	}
	
	@Test
	public void diffTest() {
		int a = 12;
		int b = 10;
		CalcService cs = new CalcService();
		System.out.println("Testing Diff");
		Assertions.assertEquals(cs.diff(a, b), 2);
	}
	
	@Test
	public void mulTest() {
		int a = 10;
		int b = 5;
		CalcService cs = new CalcService();
		System.out.println("Testing Multiply");
		Assertions.assertEquals(cs.mul(a, b), 50);
	}
	
	@Test
	public void divTest() {
		int a = 80;
		int b = 8;
		CalcService cs = new CalcService();
		System.out.println("Testing Divide");
		Assertions.assertEquals(cs.div(a, b), 10);
	}

}