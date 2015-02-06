package edu.itla.carreras.graficos.vehiculos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Carro extends Vehiculo{
	public Carro(String nombreImagen, int x , int y){
		setNombreImagen(nombreImagen);
		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon(nombreImagen));
		setEtiqueta(etiqueta);
		setX(x);
		setY(y);
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++){
			try {
				setX(getX()+ getVelocidad());
				getEtiqueta().setLocation(getX(), getY());
				
				Thread.sleep(1000/getVelocidad());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
