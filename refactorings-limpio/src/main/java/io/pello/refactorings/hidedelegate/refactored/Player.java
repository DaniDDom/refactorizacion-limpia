package io.pello.refactorings.hidedelegate.refactored;

public class Player {
	private Die die;
	
	public Player () {
		this.die = new Die();
	}
	
	public int roll () {
		return die.roll();
	}

	public Die getDie() {
		return die;
	}
	
	
}
