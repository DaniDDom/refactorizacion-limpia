package io.pello.refactorings.hidedelegate.refactored;

/**
 * Hide Delegate
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Main {
	private Player player;
	private Die die;
	
	public Main () {
		init();
	}
	
	private void init () {
		player = new Player();
	}
	
	public int roll () {
		return player.roll();
	}
}
