package com.formation.service;

public class FeedbackFactory {

	public IFeedback getFeedback() {
		return new FeedbackToConsole();

	}

}
