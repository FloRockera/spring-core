package com.formation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.formation.user.UserInteraction;

@ContextConfiguration(classes = { AppConfig.class })

@RunWith(SpringRunner.class)
public class UserInteractionTest {

	@Autowired
	UserInteraction userInteraction;

	@Test
	public void TheCaptainAgeForAFamousThreeMastTest() {

		int captainAge;

		captainAge = userInteraction.sayTheCaptainAgeForAFamousThreeMast();

		assertEquals(58, captainAge);

	}
}
