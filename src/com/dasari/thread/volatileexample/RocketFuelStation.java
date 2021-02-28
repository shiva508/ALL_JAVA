package com.dasari.thread.volatileexample;

public class RocketFuelStation {
	private static volatile int fuelAmount;

	public void refillShip(Spaceship spaceship, int ammount) {
		if (ammount <= fuelAmount) {
			spaceship.refill(ammount);
			fuelAmount -= ammount;
			System.out.println("Rocket Fuel Station has " + fuelAmount + "l of fuel left in the end.");
		} else {
			System.out.println("Not enough fuel in the tank!");
		}
	}

	public int getFuelAmount() {
		return fuelAmount;
	}

	public RocketFuelStation setFuelAmount(int fuelAmount) {
		this.fuelAmount = fuelAmount;
		return this;
	}
	
}
