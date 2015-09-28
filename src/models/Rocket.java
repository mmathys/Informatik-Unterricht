package models;

public class Rocket {
	public final double thrustSpeed = 230;
	protected double speed;
	
	public Rocket(double initSpeed) {
		this.setSpeed(initSpeed + thrustSpeed);
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}
