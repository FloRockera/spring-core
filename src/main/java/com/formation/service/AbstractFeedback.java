package com.formation.service;

public abstract class AbstractFeedback implements IFeedback {

	// attributs
	private float boatsize = 10;
	private int nbMast = 3;

	// constructeur
	public AbstractFeedback(float boatsize, int nbMast) {
		super();
		this.boatsize = boatsize;
		this.nbMast = nbMast;
	}

	public int giveMeTheCaptainAge(float boatSize, int nbMast) {
		return (int) Math.round(Math.pow(boatSize, 2.0) + Math.cos((double) nbMast) * 42);

	}

}
