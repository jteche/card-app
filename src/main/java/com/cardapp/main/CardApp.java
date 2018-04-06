package com.cardapp.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.cardapp.util.CardsEnum;
import com.cardapp.util.SuitsEnum;

public class CardApp {

	private static final Logger logger = Logger.getLogger(CardApp.class.getName());
	static final List<String> myDeck = new ArrayList<>();

	static {
		// Fill the data
		fillData();
	}

	public static void main(String[] args) {

		CardApp app = new CardApp();

		if (null != args && args.length > 0) {

			int choice = Integer.parseInt(args[0]);
			try {

				switch (choice) {
				case 1:
					System.out.println(" Cards are shuffled successfully as shown below");
					System.out.println(" ");
					app.shuffleCards();
					break;
				case 2:
					System.out.println(" It's a Deal for one card.");
					System.out.println(" The selected card is as follows.");
					System.out.println(" ");
					System.out.println(" " +app.dealOneCard());
					break;
				case 3:
					System.out.println(" It's a Deal for All the cards as below.");
					System.out.println(" ");
					app.dealAllCards();
					break;
				default:
					break;
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE, "An exception has occurred", e);
			}
		}
		
		
	}

	List<String> dealAllCards() {
		System.out.println(myDeck);
		return myDeck;
	}

	String dealOneCard() {
		return myDeck.get(genrateRandom());
	}

	List<String> shuffleCards() {
		final List<String> shuffledList = new ArrayList<>();
		for (int i = 1; i <= myDeck.size(); i++) {
			shuffledList.add(myDeck.get(genrateRandom()));

		}
		Collections.shuffle(myDeck);
		System.out.println(myDeck);
		return shuffledList;
	}

	private static void fillData() {

		for (Entry<String, Integer> suits : SuitsEnum.SUIT_MAP.entrySet()) {
			for (Entry<String, Integer> cards : CardsEnum.CARD_MAP.entrySet())
				myDeck.add(suits.getKey() + " Of " + cards.getKey());

		}
	}

	private int genrateRandom() {
		Random r = new Random();
		return r.nextInt(52 - 1) + 1;
	}
}
