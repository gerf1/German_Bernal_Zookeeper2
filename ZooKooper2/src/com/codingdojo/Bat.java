package com.codingdojo;

public class Bat extends Mammal{
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("Screech, Screech! [The Bat is flying] -> Decrement his energy level to "+energyLevel+" (-50)");
	}
	public void eatHumans() {
		energyLevel +=25;
		System.out.println("Cham, Cham!! [The Bat is eating] -> Increases his energy level to "+energyLevel+" (+25)");
	}
	public void attackTown() {
		energyLevel -=100;
		System.out.println("Chunk, Chunk! [The Bat is attacking a town] -> Decrement his energy level to "+energyLevel+" (-100)");
	}

}
