package io.pello.refactorings.rename.refactored;

/**
 * Rename variables and methods
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Conversor {

	private static final float EUROS_PESETAS_CHANGE_RATE = 166.386f;
	public float eurosToPesetas(float euros) {

		float pesetas = euros * EUROS_PESETAS_CHANGE_RATE;
		return pesetas;
	   }
}
