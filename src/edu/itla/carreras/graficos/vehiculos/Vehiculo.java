package edu.itla.carreras.graficos.vehiculos;

import javax.swing.JLabel;

public abstract class Vehiculo extends Thread{
	private JLabel etiqueta;
	private String nombreImagen;
	private int velocidad;
	private int x;
	private int y;
	public JLabel getEtiqueta() {
		return etiqueta;
	}
	public void setEtiqueta(JLabel etiqueta) {
		this.etiqueta = etiqueta;
	}
	public String getNombreImagen() {
		return nombreImagen;
	}
	public void setNombreImagen(String nombreImagen) {
		this.nombreImagen = nombreImagen;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}



}
