package io.pello.refactorings.replacearraywithobject.refactored;

import java.util.Arrays;

/**
 * Replace Array with Object This class is intended to be used as a refactoring
 * playground
 * 
 * @author PELLO_ALTADILL
 */
public class Airplane {

	private String model;
	private Pilot pilot;

	public Airplane(String model) {
		this.model = model;
	}

	public void initPilot(String name, String license, int flightHours) {
		pilot = new Pilot(name,license,flightHours);
	}

	@Override
	public String toString() {
		return "Airplane [model=" + model + ", pilot=" + pilot + "]";
	}
}
