package _06_Card_Game;

import java.util.ArrayList;
import java.util.Random;

public class CardDealer {
    
    ArrayList<Card> deck;
    
    ArrayList<Card> buildDeck() {
    	ArrayList<Card> temp = new ArrayList<Card>();
    	for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				temp.add(new Card(rank,suit));
			}
		}
		return temp;
    }
    
    ArrayList<Card> shuffleDeck(){
    	ArrayList<Card> temp2 = new ArrayList<Card>();
		return temp2;
    }

}
