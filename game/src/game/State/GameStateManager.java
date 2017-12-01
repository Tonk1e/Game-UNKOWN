package game.State;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GameStateManager {

	private ArrayList<GameState> gameStates;
	private int currentState;
	
	// Enum-like key system
	public static final int MENUSTATE = 0;
	public static final int NEWGAMESTATE = 1;
	
	public GameStateManager() {
		
		gameStates = new ArrayList<GameState>();
		
		currentState = MENUSTATE;
		gameStates.add(new MenuState(this));
	}
	
	public void setState(int state) {
		currentState = state;
		gameStates.get(currentState).init();
	}
	
	public void update() {
		gameStates.get(currentState).update();
	}
	
	public void draw(Graphics2D g) {
		gameStates.get(currentState).draw(g);
	}
	
	public void keyPressed(int k) {
		gameStates.get(currentState).keyPressed(k);
	}
	
	public void keyReleased(int k) {
		gameStates.get(currentState).keyReleased(k);
	}
	
}
