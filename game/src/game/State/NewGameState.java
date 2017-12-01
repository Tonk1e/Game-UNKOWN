package game.State;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class NewGameState extends GameState{

	public NewGameState(GameStateManager gsm){
		this.gsm = gsm;
	}

	public void init(){
		int number_of_chars = 0;
	}
	public void update(){}
	public void create_initial_box(Graphics g){
		g.setColor(Color.white);
		g.fillRect(0, -100, 300, 100)
	}

	public create_first_char(Graphics g, String input){
		if (
	}

	public add_char(Graphics g){
		for (char i; i < input; i++){
			g.drawChars(input[i], 35, 35, x,y)
		}
	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(int k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(int k) {
		// TODO Auto-generated method stub
		
	}
} 