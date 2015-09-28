package models;

public class Commander extends Crew {
	 
	private double armor;
	
	public Commander(String name, double health, double armor) {
		super(name, health);
		this.armor = armor;
	}
	
	@Override
	public void hit(double damage) {
		if(armor >= 0){
			if(damage >= armor){
				damage = damage - armor;
				armor = 0;
				health = health - damage;
			} else {
				armor = armor - damage;
			}
		}
	}

	public double getArmor() {
		return armor;
	}

	public void setArmor(double armor) {
		this.armor = armor;
	}

}
