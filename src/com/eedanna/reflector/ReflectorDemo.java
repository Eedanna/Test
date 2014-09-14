package com.eedanna.reflector;

import java.lang.reflect.Method;

public class ReflectorDemo {

	public ReflectorDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method[] methods = ReflectorDemo.class.getMethods();
		 System.out.println("length >> "+methods.length);
		for(Method method : methods){
		    System.out.println("method = " + method.getName());
		}

	}

}
