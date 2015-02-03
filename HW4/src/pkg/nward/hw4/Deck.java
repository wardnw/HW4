package pkg.nward.hw4;

import java.util.ArrayList;
import java.util.Collections;

import pkg.nward.hw4.Card.Rank;
import pkg.nward.hw4.Card.Suit;

public class Deck {

	//declare list
	private ArrayList<Card> newDeck;
	private ArrayList<Card> newHand;
	
	//constructor that instantiates list
	public Deck(){
		newDeck = fillDeck();
		
	}


	
	private ArrayList<Card> fillDeck(){
		ArrayList<Card> d = new ArrayList<Card>();
		for (Suit s : Suit.values())
			for (Rank r : Rank.values())
				d.add(new Card(r, s));
		
		return d;
	}

	
	
	public void shuffleDeck(){
		Collections.shuffle(newDeck);
	}
	
	public ArrayList<Card> dealHand(){
		ArrayList<Card> h = new ArrayList<Card>();
		for(int i = 0; i < 5; i++){
			h.add(newDeck.get(i));
		}
		return h;
	}
}
	//test method to check that enum worked (remove)
	/*public void testPrint(){
		for (Card c : newDeck){
			System.out.println();
			System.out.println(c.getRank());
			System.out.println(c.getSuit());
		}
	}
		
	}
	*/

