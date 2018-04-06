package com.cardapp.util;

import java.util.HashMap;
import java.util.Map;

public enum CardsEnum {

	Ace(1), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(
			13);

	public static final Map<String, Integer> CARD_MAP = new HashMap<>();

	// Initialize MAP with default K,V Pair
	static {
		for (CardsEnum c : values()) {
			CARD_MAP.put(c.name(), c.getCardCode());
		}
	}

	private CardsEnum(int cardNo) {
		this.cardCode = cardNo;
	}

	private int cardCode;

	public int getCardCode() {
		return cardCode;
	}
}
