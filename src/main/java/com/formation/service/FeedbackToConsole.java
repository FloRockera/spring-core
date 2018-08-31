package com.formation.service;

import org.springframework.stereotype.Component;

@Component
public class FeedbackToConsole implements IFeedback {

	public void say(String something) {

		System.out.println(something);
	}

	@Override
	public int giveMeTheCaptainAge(float boatSize, int nbMast) {
		// TODO Auto-generated method stub
		return (int) Math.round(Math.pow(boatSize, 2.0) + Math.cos((double) nbMast) * 42);
	}

}
