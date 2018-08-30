package com.formation;

import com.formation.service.FeedbackFactory;
import com.formation.user.UserInteraction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// Instanciation des int�ractions

		FeedbackFactory factory = new FeedbackFactory();

		UserInteraction ui = new UserInteraction();
		ui.setFactory(factory);
		ui.sayHello("Dudule");
		ui.sayGoodBye("Dudule");
	}
}