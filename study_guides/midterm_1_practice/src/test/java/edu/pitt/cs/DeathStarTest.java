package edu.pitt.cs;

import static org.junit.Assert.*;
import org.mockito.*;

import io.cucumber.java.Before;

import org.junit.Test;

public class DeathStarTest {

	/**
	 * Write an integration test for shoot.
	 * 
	 * <pre>
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: Call deathStar.shoot(planet)
	 * PostConditions: Return value of call is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 * </pre>
	 */
	@Test
	public void testShootPlanetIntegration() {
		// TODO: Fill in!

		//Preconditions
		DeathStar deathStar = new DeathStar();
		Planet planet = new Planet(10);

		//Execution Steps
		String result = deathStar.shoot(planet);
		String expected = "Wimpy planet was hit by the superlaser!";
		int hpResult = planet.getHitPoints();

		//Postconditions
		assertEquals(expected, result);

		
		assertEquals(-90, hpResult);
	}

	/**
	 * Write an unit test for shoot.
	 * 
	 * <pre>
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: Call deathStar.shoot(planet)
	 * PostConditions: Return value of call is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 * </pre>
	 */
	@Test
	public void testShootPlanetUnit() {
		// TODO: Fill in!
		fail();
	}
}
