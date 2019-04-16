package ru.sibnsk.bubleshooter2d;

import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;

public class LifePlayer {

	// Fields

	private Color color1;

	// COnstructors
	public LifePlayer() {
		color1 = Color.GREEN;
	}

	// Functions
	public void update() {
		
		if (GamePanel.player.health == 4) {
			color1 = Color.green;
		} else if (GamePanel.player.health == 3) {
			color1 = Color.ORANGE;
		} else if (GamePanel.player.health == 2) {
			color1 = Color.GRAY;
		} else if (GamePanel.player.health == 1) {
			color1 = Color.LIGHT_GRAY;
		} else {
			color1 = Color.RED;
		}
		
	}

	public void draw(Graphics2D g) {

		g.setColor(color1);
		g.fillOval(20, 30, 10, 10);
		g.setStroke(new BasicStroke(10));
		g.setColor(Color.WHITE);
		g.setFont(new Font("Consolas", Font.BOLD, 20));
		g.drawString("Life", 10, 20);
		g.setColor(color1.darker());
		g.drawOval(20, 30, 10, 10);
		g.setStroke(new BasicStroke(1));

		g.setColor(Color.WHITE);
		g.setFont(new Font("Consolas", Font.BOLD, 20));
		g.drawString(String.valueOf(GamePanel.player.health), 20, 42);
		
		//Game over
		if(GamePanel.player.health==0){
			g.setColor(Color.ORANGE);
			g.setFont(new Font("consolas",Font.BOLD,60));
			g.drawString("Game over!!!",GamePanel.WIDTH/5,GamePanel.HEIGTH/2);
		}		
	}
	
}
