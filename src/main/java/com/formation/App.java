package com.formation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.user.UserInteraction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");

		UserInteraction ui = applicationContext.getBean(UserInteraction.class);

		ui.sayHello("Dudule");
		ui.sayGoodBye("Dudule");
	}
}