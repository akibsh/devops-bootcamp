package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.CalcAreaOfTriangleService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalcAreaOfTriangleService {

	@Test
	public void TestArea1() {
		double a = 3.5;
		double b = 4.2;
		CalcAreaOfTriangleService cs = new CalcAreaOfTriangleService();
		System.out.println("Testing Area - 1");
		Assertions.assertEquals(cs.area(a, b), 7.35);
	}
	
	@Test
	public void TestArea2() {
		double a = 1.0;
		double b = 4.0;
		CalcAreaOfTriangleService cs = new CalcAreaOfTriangleService();
		System.out.println("Testing Area - 2");
		Assertions.assertEquals(cs.area(a, b), 2.00);
	}
	
	@Test
	public void TestArea3() {
		double a = 2.2;
		double b = 2.2;
		CalcAreaOfTriangleService cs = new CalcAreaOfTriangleService();
		System.out.println("Testing Area - 3");
		Assertions.assertEquals(cs.area(a, b), 2.42);
	}
	
	@Test
	public void TestArea4() {
		double a = 8.1;
		double b = 7.6;
		CalcAreaOfTriangleService cs = new CalcAreaOfTriangleService();
		System.out.println("Testing Area - 4");
		Assertions.assertEquals(cs.area(a, b), 30.78);
	}
	
	@Test
	public void TestArea5() {
		double a = 0.5;
		double b = 7.5;
		CalcAreaOfTriangleService cs = new CalcAreaOfTriangleService();
		System.out.println("Testing Area - 5");
		Assertions.assertEquals(cs.area(a, b), 1.88);
	}
}
