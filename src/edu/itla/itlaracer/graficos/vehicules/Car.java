package edu.itla.itlaracer.graficos.vehicules;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Car extends Vehicule{
	public Car(String nombreImagen){
		setNombreImagen(nombreImagen);
		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon(nombreImagen));
		setLabel(etiqueta);
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++){
			try {
				setX(getX()+ getVelocity());
				getLabel().setLocation(getX(), (int) getLabel().getLocation().getY());
				Thread.sleep(1000/getVelocity());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
