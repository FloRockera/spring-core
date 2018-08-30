package com.formation.user;

import java.text.MessageFormat;

import com.formation.service.IFeedback;

//Classe pour r�aliser les int�ractions avec les utilisateurs
public class UserInteraction {

	private IFeedback feedback;

	public void setFeedback(IFeedback feedback) {
		this.feedback = feedback;
	}

	// Pour dire bonjour � l'utilisateur
	public void sayHello(String name) {
		feedback.say(MessageFormat.format("Hello {0}!", name));
	}

	// Pour dire aurevoir � l'utilisateur
	public void sayGoodBye(String name) {
		feedback.say(MessageFormat.format("Goodbye {0}!", name));
	}

}
