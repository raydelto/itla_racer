package edu.itla.carreras.graficos;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;

import edu.itla.carreras.graficos.vehiculos.Vehiculo;

public class Pista extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Vehiculo> vehiculos;
	public Pista(){
		super("ITLA Racer v0.1");
		setSize(800,600);
		getRootPane().setBackground(Color.GRAY);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		vehiculos = new ArrayList<Vehiculo>();
		setVisible(true);
	};
	
	public void agregar(Vehiculo vehiculo){
		vehiculos.add(vehiculo);		
	}
	
	public void iniciar(){
		for(Vehiculo vehiculo : vehiculos){
			add(vehiculo.getEtiqueta());
			vehiculo.getEtiqueta().setLocation(vehiculo.getX(), vehiculo.getY());
			vehiculo.start();
			
		}
	}

}
