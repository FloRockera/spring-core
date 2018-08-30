package com.formation.service;

public class FeedbackToConsole implements IFeedback {

	public void say(String something) {

		System.out.println(something);
	}

}
