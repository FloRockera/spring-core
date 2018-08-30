package com.formation.user;

import java.text.MessageFormat;

import com.formation.service.FeedbackFactory;
import com.formation.service.FeedbackToConsole;
import com.formation.service.IFeedback;

//Classe pour réaliser les intéractions avec les utilisateurs
public class UserInteraction {

	private IFeedback feedback;
	private FeedbackFactory factory;

	public UserInteraction() {
		feedback = new FeedbackToConsole();
	}

	public void setFactory(FeedbackFactory factory) {
		this.factory = factory;
	}

	// Pour dire bonjour à l'utilisateur
	public void sayHello(String name) {
		factory.getFeedback().say(MessageFormat.format("Hello {0}!", name));
	}

	// Pour dire aurevoir à l'utilisateur
	public void sayGoodBye(String name) {
		factory.getFeedback().say(MessageFormat.format("Goodbye {0}!", name));
	}

}
