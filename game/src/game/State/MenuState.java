package game.State;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import game.tileMap.Background;

public class MenuState extends GameState{
	
	private Background bg;
	
	private int currentChoice = 0;
	
	private String[] options = {
		"Start",
		"Help",
		"Quit"
	};
	
	private Color titleColour;
	private Font titleFont;
	
	private Font font;
	
	public MenuState(GameStateManager gsm) {
		
		this.gsm = gsm;
		
		try {
			bg = new Background(null, 1); // for now...
			bg.setVector(-0.1, 0);
			
			titleColour = new Color(128, 0, 0);
			titleFont = new Font("Comic Sans MS", Font.PLAIN, 28); // Oh yes.
			font = new Font("Arial", Font.PLAIN, 12);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void init() {}
	public void update() {
		bg.update();
	}
	public void draw(Graphics2D g) {
		bg.draw(g);
		
		g.setColor(titleColour);
		g.setFont(titleFont);
		g.drawString("Game-UNKNOWN", 80, 70);
		
		g.setFont(font);
		for(int i = 0; i < options.length; i++) {
			if(i == currentChoice) {
				g.setColor(Color.WHITE);
			}
			else {
				g.setColor(Color.GREEN);
			}
			g.drawString(options[i], 145, 140 + i * 15);
		}
	}
	
	private void select() {
		if(currentChoice == 0) {
			
		}
		if(currentChoice == 1) {
			
		}
		if(currentChoice == 2) {
			/*
			 * I did this but I think that in an ideal world we
			 * should write a function that clears the threads if
			 * that is even needed...
			 */
			System.exit(0);
		}
	}
	
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_ENTER) {
			select();
		}
		if(k == KeyEvent.VK_UP) {
			currentChoice--;
			// Disallow choice from going into negatives
			if(currentChoice == -1) {
				currentChoice = options.length - 1;
			}
		}
		if(k == KeyEvent.VK_DOWN) {
			currentChoice++;
			// Disallow choice from going over the amount of options.
			if(currentChoice == options.length) {
				currentChoice = 0;
			}
		}
	}
	public void keyReleased(int k) {}
	
}
