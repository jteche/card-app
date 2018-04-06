package com.cardapp.util;

import java.util.HashMap;
import java.util.Map;

public enum SuitsEnum {

	Hearts(1), Spades(2), Diamonds(3), Stars(4);

	SuitsEnum(int suit) {
		this.suit = suit;
	}

	public static final Map<String, Integer> SUIT_MAP = new HashMap<>();

	// Initialize MAP with default K,V Pair
	static {
		for (SuitsEnum s : values()) {
			SUIT_MAP.put(s.name(), s.getSuit());
		}
	}

	public int getSuit() {
		return suit;
	}

	private int suit;

}
