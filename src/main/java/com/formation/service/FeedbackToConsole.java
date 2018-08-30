package com.formation.service;

import org.springframework.stereotype.Component;

@Component
public class FeedbackToConsole implements IFeedback {

	public void say(String something) {

		System.out.println(something);
	}

}
