package com.example.demo.topic;

import org.springframework.stereotype.Service;

@Service
public class AddService {

	
	
	public int add(int a , int b) {
		
		return a+b;
	}
	public double CircleArea(double radius) {
		return Math.PI*radius*radius;
		
	}
	public int div(int a, int b) {
		return a/b;
	}
	

	

	
}
