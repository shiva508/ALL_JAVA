package com.dasari.thread.volatileexample;

public class VolatileSimullater {
	public static void main(String[] args) throws InterruptedException {
		RocketFuelStation fuelStation=new RocketFuelStation().setFuelAmount(100);
		Spaceship ship = new Spaceship(fuelStation);
		Spaceship ship2 = new Spaceship(fuelStation);
		ship.start();
		ship2.start();
		ship.join();
		ship2.join();
		System.out.println("Ship 1 fueled up and now has: " + ship.getFuel() + "l of fuel");
		System.out.println("Ship 2 fueled up and now has: " + ship2.getFuel() + "l of fuel");

		
	}
}
