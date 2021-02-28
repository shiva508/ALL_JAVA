package com.dasari.thread.volatileexample;

public class Spaceship extends Thread {
	private volatile int fuel;
	private RocketFuelStation rfs;

	public Spaceship(RocketFuelStation rfs) {
		this.rfs = rfs;
	}
	
	public void refill(int ammount) {
		fuel+=ammount;
	}

	
	
	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public RocketFuelStation getRfs() {
		return rfs;
	}

	public void setRfs(RocketFuelStation rfs) {
		this.rfs = rfs;
	}

	@Override
	public void run() {
		rfs.refillShip(this, 50);
	}
	
}
