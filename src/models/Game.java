package models;

import java.util.ArrayList;

public class Game {
	protected ArrayList<Rocket> rockets = new ArrayList<Rocket>();
	protected ArrayList<Spaceship> spaceships = new ArrayList<Spaceship>();
	
	public void fireRocket(Spaceship fromSpaceship) {
		Rocket rocket = new Rocket(fromSpaceship.getSpeed());
		rockets.add(rocket);
	}
	
	public ArrayList<Rocket> getRockets() {
		return this.rockets;
	}
	
	public void addRocket(Rocket rocket) {
		this.rockets.add(rocket);
	}
	
	public ArrayList<Spaceship> getSpaceships() {
		return this.spaceships;
	}
	
	public void addSpaceshop(Spaceship spaceship) {
		this.spaceships.add(spaceship);
	}
	
}
