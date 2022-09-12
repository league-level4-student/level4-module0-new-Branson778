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
				//System.out.println(temp.get(temp.size()-1).toString() + "" + temp.size());
			}
		}
		return temp;
    }
    
    ArrayList<Card> shuffleDeck(ArrayList<Card> deck){
    	for (int i = 0; i < 249; i++) {
			Random  ran = new Random();
			int ranIntOne = ran.nextInt(52);
			int ranIntTwo = ran.nextInt(52);
			int ranIntThree = ran.nextInt(52);
			int ranIntFour = ran.nextInt(52);
			if(ranIntOne == ranIntTwo || ranIntOne == ranIntThree || ranIntOne == ranIntFour || ranIntTwo == ranIntThree || ranIntTwo == ranIntFour ||ranIntThree == ranIntFour ) {
				continue;
			}
			else {
				Card temp = deck.get(ranIntOne);
				Card tempTwo = deck.get(ranIntThree);
				deck.set(ranIntOne, deck.get(ranIntTwo));
				deck.set(ranIntTwo, temp);
				deck.set(ranIntThree, deck.get(ranIntFour));
				deck.set(ranIntFour, tempTwo);
 			}
		}
		return deck;
    }

}
