package edu.itla.carreras;

import edu.itla.carreras.graficos.Pista;
import edu.itla.carreras.graficos.vehiculos.Carro;

public class Sistema {
	public static void main(String[] args) {
		Pista pista = new Pista();
		Carro carro1 = new Carro("carro1.png",0,200);
		Carro carro2 = new Carro("carro1.png",0,400);
		carro1.setVelocidad(1);
		carro2.setVelocidad(2);
		pista.agregar(carro1);
		pista.agregar(carro2);
		pista.iniciar();	
	}
}
