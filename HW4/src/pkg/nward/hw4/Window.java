package pkg.nward.hw4;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class Window implements ActionListener {

	JButton deal;
	JButton exit;
	JFrame frame;
	
	Deck d;
	ArrayList<Card> hand;
	
	
	//constructor to build window and add stuff
	public Window(){
		//instantiate deck
		d = new Deck();
		d.shuffleDeck();
		
		hand = d.dealHand();
		
		frame = new JFrame();
		frame.setBounds(400, 400, 600, 300);
		frame.add(makeMainPanel());
		frame.setVisible(true);
		
		//d.testPrint();
	}
	//border panel
	private JPanel makeMainPanel(){
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(makeButtonPanel(), BorderLayout.SOUTH);
		mainPanel.add(makeCardPanel(), BorderLayout.CENTER);
		
		return mainPanel;
	}
	
	//buttons panel
	private JPanel makeButtonPanel(){
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		deal = new JButton("Deal");
		deal.addActionListener(this);
		buttonPanel.add(deal);
		exit = new JButton("Exit");
		exit.addActionListener(this);
		buttonPanel.add(exit);
		return buttonPanel;
	}
	

	//card panel (strings for now)
	//work out best way to do the strings before screwing with images
	private JPanel makeCardPanel(){
		JPanel cardPanel = new JPanel();
		cardPanel.setLayout(new GridLayout(1, 5, 5, 5));
		
		
		
		Card card0 = hand.get(0);
		Card card1 = hand.get(1);
		Card card2 = hand.get(2);
		Card card3 = hand.get(3);
		Card card4 = hand.get(4);
		JLabel c0 = new JLabel(parseCard(card0));
		cardPanel.add(c0);
		JLabel c1 = new JLabel(parseCard(card1));
		cardPanel.add(c1);
		JLabel c2 = new JLabel(parseCard(card2));
		cardPanel.add(c2);
		JLabel c3 = new JLabel(parseCard(card3));
		cardPanel.add(c3);
		JLabel c4 = new JLabel(parseCard(card4));
		cardPanel.add(c4);
		
		
	
		return cardPanel;
	}
	
	private String parseCard(Card c){
		String s = c.getRank() + " " + c.getSuit();
		return s;
	}
	//action listener
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if(source == deal){
			d.shuffleDeck();
			d.dealHand();
			
			
		}
		if(source == exit){
			System.exit(0);
		}
	}
	

	
	
}
