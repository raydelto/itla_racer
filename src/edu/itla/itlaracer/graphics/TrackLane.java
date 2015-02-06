package edu.itla.itlaracer.graphics;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TrackLane extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("track_lane.png");
		super.setOpaque(false);
		g.drawImage(image.getImage(), 0, 0, null);
		super.paintComponent(g);
		
	}

}
