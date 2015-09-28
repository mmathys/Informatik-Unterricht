package models;

import java.util.ArrayList;

public class Spaceship {
	protected double speed;
	protected String name;
	protected ArrayList<Crew> crew = new ArrayList<Crew>();
	
	public Spaceship(String name) {
		this.setName(name);
	}
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Crew> getCrew() {
		return crew;
	}

	public void addCrew(Crew crew) {
		this.crew.add(crew);
	}
}
