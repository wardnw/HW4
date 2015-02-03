package pkg.nward.hw4;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;





public class Card {

	public enum Rank { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE }
		
	public enum Suit { DIAMONDS, HEARTS, SPADES, CLUBS }

	private static final String IMAGE_DIR = "~/Users/thegreatmagnet/Documents/workspace/HW4/cards";
	
	//declare suit and rank constants
	private final Rank rank;
	

	private final Suit suit;
	//private static final String IMAGE_DIR = "~/Users/thegreatmagnet/Documents/workspace/HW4/cards";
	
	public Card (Rank r, Suit s){
		this.rank = r;
		this.suit = s;
	}
	
	public Rank getRank(){
		return rank;
	}
	
	public Suit getSuit(){
		return suit;
	}
	

	
	
}
