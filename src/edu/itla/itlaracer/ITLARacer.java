package edu.itla.itlaracer;

import edu.itla.itlaracer.graphics.Track;
import edu.itla.itlaracer.graphics.vehicules.Car;

public class ITLARacer {
	public static void main(String[] args) {
		Track track = new Track();
		Car car1 = new Car("car.png");
		Car car2 = new Car("car.png");
		Car car3 = new Car("car.png");
		car1.setVelocity(5);
		car2.setVelocity(6);
		car3.setVelocity(4);
		track.add(car1);
		track.add(car2);
		track.add(car3);
		track.start();	
	}
}
