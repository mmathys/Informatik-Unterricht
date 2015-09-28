package models;

public class Crew {
	protected String name;
	protected double health;

	public Crew(String name, double health){
		this.setName(name);
		this.health = health;
	}
	
	public void hit(double damage) {
		this.health = this.health - damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}
}
