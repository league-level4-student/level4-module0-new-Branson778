package _06_Card_Game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Runner implements KeyListener {
     static Runner setter = new Runner();
	static CardDealer dealer = new CardDealer();
     static ArrayList<Card> deck = new ArrayList<Card>();
     JFrame frame = new JFrame();
     JPanel panel = new JPanel();
     JTextField text = new JTextField();
     
     
     public static void main(String[] args) {
		deck = dealer.buildDeck();
		setter.setUp();

	}
     void setUp(){
    	 frame.setVisible(true);
    	 frame.setSize(450,250);
    	 frame.add(panel);
    	 panel.add(text);
    	 frame.addKeyListener(this);
    	 panel.addKeyListener(this);
    	 text.setEditable(false);
    	 deck = dealer.shuffleDeck(deck);
    	 text.setText("-----------------------------------Starting-----------------------------------");
     }
     boolean checkSlap(){
		return false;
    	 
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
				JOptionPane.showConfirmDialog(null, "Player 1, You Slapped Too Early. Try Again?");
			}
			if(checkSlap()==true) {
				JOptionPane.showConfirmDialog(null, "Player 1, You Slapped Before The Other Player. Play Again?");
			}
		}
		if(key.getKeyCode() == KeyEvent.VK_I) {
			System.out.println("Pressed I");
			if(checkSlap()==false) {
				JOptionPane.showConfirmDialog(null, "Player 2, You Slapped Too Early. Try Again?");
			}
			if(checkSlap()==true) {
				JOptionPane.showConfirmDialog(null, "Player 2, You Slapped Before The Other Player. Play Again?");
			}
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
     
}
