package Aula03_Ex3_2;

import java.util.*;
import java.util.ArrayList;
import java.util.Random;

enum Suit {
	SPADES,
	HEARTS,
	CLUBS,
	DIAMONDS
}
class Card {
	public Card(Suit s, int n) {
		suit = s;
		if((n < 2) || (n > 14)) {
			throw new IllegalArgumentException( );
		}

		number = n;
	}
	public void print( ) {
		switch(number) {
		case 11:
			System.out.print("Jack");
			break;
		case 12:
			System.out.print("Queen");
			break;
		case 13:
			System.out.print("King");
			break;
		case 14:
			System.out.print("Ace");
			break;
		default:
			System.out.print(number);
			break;
		}
		System.out.print(" of ");
		switch(suit) {
		case SPADES:
			System.out.println("spades.");
			break;
		case HEARTS:
			System.out.println("hearts.");
			break;
		case CLUBS:
			System.out.println("clubs.");
			break;
		case DIAMONDS:
			System.out.println("diamonds.");
			break;
		}
	}
	private Suit suit;
	private int number;
}
class Deck {
	static Deck instance = new Deck(); 
	Deck( ){	
		cards = new ArrayList<Card>( );
		// build the deck
		Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS,

				Suit.DIAMONDS};
		for(Suit suit: suits) {
			for(int i = 2; i <= 14; i++) {
				cards.add(new Card(suit, i));
			}
		}

		// shuffle it!
		Collections.shuffle(cards, new Random( ));
	}
	public void print( ) {
		for(Card card: cards) {
			card.print( );
		}
	}
	private List<Card> cards;
}

public class Ex03 {
	public static void main(String args[]) {
		Deck deck = new Deck( );
		for(int i = 0;i<14;i++) {
		deck.print( );
		}
	}
}
