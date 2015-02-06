package edu.itla.itlaracer.graphics;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

import edu.itla.itlaracer.graphics.vehicules.Vehicule;

public class Track extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Vehicule> vehicules;
	public Track(){
		super("ITLA Racer v0.1");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		vehicules = new ArrayList<Vehicule>();
		
	};
	
	public void add(Vehicule vehicule){
		vehicules.add(vehicule);		
	}
	
	public void start(){
		setLayout(new GridLayout(vehicules.size(),1));
		TrackLane lane = null;
		for(Vehicule vehicule : vehicules){
			lane = new TrackLane();			
			lane.add(vehicule.getLabel());
			add(lane);
		}		
		setVisible(true);
		for(Vehicule vehicule : vehicules){
			vehicule.getLabel().setLocation(vehicule.getX(),(int) vehicule.getLabel().getLocation().getY());
			vehicule.start();
		}

	}

}
