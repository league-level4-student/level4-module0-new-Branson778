package _06_Card_Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Runner implements KeyListener, ActionListener {
     static Runner setter = new Runner();
	static CardDealer dealer = new CardDealer();
     static ArrayList<Card> deck = new ArrayList<Card>();
     JFrame frame = new JFrame();
     JPanel panel = new JPanel();
     JLabel text = new JLabel("");
     JLabel text2 = new JLabel("");
     Timer placeTimer = new Timer(1500, this);
     int placeIndex = 0;
     static ArrayList<Card> placed = new ArrayList<Card>();
     
     
     public static void main(String[] args) {
		deck = dealer.buildDeck();
		setter.setUp();

	}
     void setUp(){
    	 frame.setVisible(true);
    	 frame.setSize(450,250);
    	 frame.setTitle("Slap Jack");
    	 frame.add(panel);
    	 panel.add(text);
    	 panel.add(text2);
    	 frame.addKeyListener(this);
    	 deck = dealer.shuffleDeck(deck);
    	 text.setText("-----------------------------------Starting-----------------------------------");
    	 text2.setText("");
    	 placed = new ArrayList<Card>();
    	 placeIndex = 0;
    	 placeCard(placed);
    	 placeCard(placed);
    	 placeTimer.start();
     }
     void restart() {
    	 deck = dealer.shuffleDeck(deck);
    	 text.setText("-----------------------------------Starting-----------------------------------");
    	 text2.setText("");
    	 placed = new ArrayList<Card>();
    	 placeIndex = 0;
    	 placeCard(placed);
    	 placeCard(placed);
    	 placeTimer.start();
     }
     boolean checkSlap(){
		if(placeIndex+1>1) {
			if(placed.get(placed.size()-1).getRank().equals(placed.get(placed.size()-2).getRank())|| placed.get(placed.size()-1).getRank()==Rank.JACK) {
				return true;
			}
		}
		return false;
     }
     void placeCard(ArrayList<Card> list) {
    	 list.add(deck.get(placeIndex));
    	 text2.setText(text.getText());
    	 text.setText(list.get(placeIndex).toString());
    	 placeIndex++;
     }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent key) {
		System.out.println("Key Pressed");
		if(key.getKeyCode() == KeyEvent.VK_E) {
			System.out.println("Pressed E");
			if(checkSlap()==false) {
				placeTimer.stop();
				int temp = JOptionPane.showConfirmDialog(null, "Player 1, You Slapped Too Early. Try Again?");
				System.out.println(temp);
				if (temp==0) {
					setter.restart();
					return;
				}
				else if(temp==1) {
					System.exit(0);
				}
				else {
					//System.out.println("ERROR WITH RESTART AND EXIT");
					System.exit(0);
				}
				
			}
			if(checkSlap()==true) {
				placeTimer.stop();
				int temp = JOptionPane.showConfirmDialog(null, "Player 1, You Slapped Before The Other Player And Won! Play Again?");
				System.out.println(temp);
				if (temp==0) {
					setter.restart();
					return;
				}
				else if(temp==1) {
					System.exit(0);
				}
				else {
					//System.out.println("ERROR WITH RESTART AND EXIT");
					System.exit(0);
				}
			}
		}
		if(key.getKeyCode() == KeyEvent.VK_I) {
			System.out.println("Pressed I");
			if(checkSlap()==false) {
				placeTimer.stop();
				int temp = JOptionPane.showConfirmDialog(null, "Player 2, You Slapped Too Early. Try Again?");
				System.out.println(temp);
				if (temp==0) {
					setter.restart();
					return;
				}
				else if(temp==1) {
					System.exit(0);
				}
				else {
					//System.out.println("ERROR WITH RESTART AND EXIT");
					System.exit(0);
				}
			}
			if(checkSlap()==true) {
				placeTimer.stop();
				int temp = JOptionPane.showConfirmDialog(null, "Player 2, You Slapped Before The Other Player And Won! Play Again?");
				System.out.println(temp);
				if (temp==0) {
					setter.restart();
					return;
					
				}
				else if(temp==1) {
					System.exit(0);
				}
				else{
					//System.out.println("ERROR WITH RESTART AND EXIT");
				
					System.exit(0);
				}
			}
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action Performed");
		if(e.getSource()==placeTimer) {
			placeCard(placed);
		}

		
	}
     
}
