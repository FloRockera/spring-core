package com.formation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Hello World!");

		String name = "Flo";

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

	}
}