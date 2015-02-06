package edu.itla.itlaracer;

import edu.itla.itlaracer.graficos.vehicules.Car;
import edu.itla.itlaracer.graphics.Track;

public class ITLARacer {
	public static void main(String[] args) {
		Track pista = new Track();
		Car car1 = new Car("car.png");
		Car car2 = new Car("car.png");
		Car car3 = new Car("car.png");
		car1.setVelocity(5);
		car2.setVelocity(6);
		car3.setVelocity(4);
		pista.add(car1);
		pista.add(car2);
		pista.add(car3);
		pista.start();	
	}
}
