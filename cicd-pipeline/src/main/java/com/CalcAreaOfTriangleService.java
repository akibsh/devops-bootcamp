package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;
import java.math.RoundingMode;


@RestController
public class CalcAreaOfTriangleService {
	
	@GetMapping("/calcarea")
	public double area(double a, double b) {
		
		double c;
		c = (a*b)/2;
		BigDecimal bd = new BigDecimal(c).setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}