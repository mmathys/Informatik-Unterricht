package oop;

import java.util.ArrayList;

import models.*;

public class Main {

	public static void main(String[] args) {
		// 1
		Game game = new Game();
		
		// 2
		Spaceship spaceship = new Spaceship("Spaceship 1");
		
		// 3
		spaceship.setSpeed(1000);
		
		// 4
		game.addSpaceshop(spaceship);
		
		// 5
		Crew crew1 = new Crew("Crew-Member 1", 30);
		Crew crew2 = new Crew("Crew-Member 2", 35);
		Crew crew3 = new Crew("Crew-Member 3", 30);
		Commander commander = new Commander("Commander", 30, 100);
		
		spaceship.addCrew(crew1);
		spaceship.addCrew(crew2);
		spaceship.addCrew(crew3);
		spaceship.addCrew(commander);
		
		// 6
		ArrayList<Crew> crewList = spaceship.getCrew();
		
		for(int i = 0; i<crewList.size(); i++) {
			Crew crew = crewList.get(i);
			crew.hit(20);
			System.out.println("Health of " + crew.getName() + ": " + crew.getHealth());
		}
		
		// 7
		game.fireRocket(spaceship);
		spaceship.setSpeed(2320);
		game.fireRocket(spaceship);
		
		ArrayList<Rocket> rockets = game.getRockets();
		
		for (int i = 0; i < rockets.size(); i++) {
			Rocket rocket = rockets.get(i);
			System.out.println("Rocket Speed: "+rocket.getSpeed());
		}
		
	}

}
