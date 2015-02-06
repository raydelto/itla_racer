package edu.itla.itlaracer.graphics.vehicules;

import javax.swing.JLabel;

public abstract class Vehicule extends Thread{
	private JLabel label;
	private String imageName;
	private int velocity;
	private int x;
	public JLabel getLabel() {
		return label;
	}
	public void setLabel(JLabel label) {
		this.label = label;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

}
