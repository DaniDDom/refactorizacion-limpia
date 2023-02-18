package io.pello.refactorings.explainingvariable.refactored;

/**
 * Introduce explaining variable refactoring playground
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
class Customer {
	private String name;
	private int age;
	private float salary;
	
	public Customer(String name, int age, float salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	public float applyDiscount (float totalAmount) {
		boolean puedeTrabajar = age > 17 && age < 66;
		boolean salarioBajo = (salary - (salary * 0.2f)) < 1000f;
		boolean cantidadBaja = totalAmount * 0.5 < 100;
		if (puedeTrabajar && salarioBajo && cantidadBaja) {
			return totalAmount * 0.9f;
		 } else {
			return totalAmount;
		 }
		}

}
