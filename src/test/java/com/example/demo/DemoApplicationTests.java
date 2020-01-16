package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.topic.AddService;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	public AddService math;
	//AddService math=new AddService();
	@Test
	void contextLoads() {
		
	}

	@Test
	void testDivision() {
		assertThrows(ArithmeticException.class, () -> math.div(1, 0), "Divide by zero throws ArithematicException");
	}
		

	@Test 
	void testAddService() {
		
		int sum=math.add(2, 1);
		int actual=3;
		assertEquals(actual, sum,"Add Method adds two Numbers");
	}
	@Test
	void testCircleArea() {
		assertEquals(314.1592653589793, math.CircleArea(10),"CircleArea method claculates Area of Circles");
	}
	
}
