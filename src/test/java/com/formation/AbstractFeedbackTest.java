package com.formation;

import org.junit.Test;

import com.formation.service.IFeedback;

import junit.framework.TestCase;

public class AbstractFeedbackTest extends TestCase {

	@Test
	public void giveMeTheCaptainAge() {

		IFeedback feedbackToConsole = (IFeedback) new AbstractFeedbackTest();
		int captainAge;

		captainAge = feedbackToConsole.giveMeTheCaptainAge(10, 3);
		assertEquals(58, captainAge);

		captainAge = feedbackToConsole.giveMeTheCaptainAge(10, 3);
		assertEquals(42, captainAge);
	}

}
