package com.cardapp.main;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CardAppTest {

	private CardApp app;

	@Before
	public void before() {
		app = new CardApp();

	}

	@Test
	public void test() {
		assertTrue(CardApp.myDeck.contains(app.dealOneCard()));
	}

}
