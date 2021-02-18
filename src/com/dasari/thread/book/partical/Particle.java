package com.dasari.thread.book.partical;


import java.util.Random;

public class Particle {
	protected int x;
	protected int y;
	protected final Random rng = new Random();

	public Particle(int initialX, int initialY) {
		super();
		this.x = initialX;
		this.y = initialY;
	}

}
