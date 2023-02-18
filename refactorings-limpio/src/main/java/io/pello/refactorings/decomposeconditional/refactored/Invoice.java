package io.pello.refactorings.decomposeconditional.refactored;

/**
 * Decompose Conditional
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Invoice {
	private Customer customer;
	
	public Invoice (Customer customer) {
		this.customer = customer;
	}
	
	public float calculatePayment (float price, float discount, float vat) {
		float payment = 0;
		
		if (descuentoAplicable()) {
		  payment = price * discount * vat;
		} else {
		  payment = price * vat;
		}
		return payment;
	}

	private boolean descuentoAplicable() {
		return customer.getAge() < 18 || customer.getAge() > 65;
	}
}
