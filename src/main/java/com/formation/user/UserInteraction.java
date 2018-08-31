package com.formation.user;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.formation.service.IFeedback;

//Classe pour r�aliser les int�ractions avec les utilisateurs
@Component
public class UserInteraction {

	@Autowired
	private IFeedback feedback;

	@Autowired
	public void setFeedback(IFeedback feedback) {
		this.feedback = feedback;
	}

	public UserInteraction() {
	}

	// Pour dire bonjour � l'utilisateur
	public void sayHello(String name) {
		feedback.say(MessageFormat.format("Hello {0}!", name));
	}

	// Pour dire aurevoir � l'utilisateur
	public void sayGoodBye(String name) {
		feedback.say(MessageFormat.format("Goodbye {0}!", name));
	}

	// Pour donner l'age du capitaine
	public int sayTheCaptainAgeForAFamousThreeMast() {
		return feedback.giveMeTheCaptainAge(10, 3);
	}

}
