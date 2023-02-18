package io.pello.refactorings.consolidateconditional.refactored;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Consolidate Conditional This class is intended to be used as a refactoring
 * playground
 * 
 * @author PELLO_ALTADILL
 */
public class Invoice {

	private Customer customer;
	private int year;

	public Invoice(Customer customer, int year) {
		this.customer = customer;
		this.year = year;
	}

	public float calculateTotal(float subtotal, float vat) {

		if (noIVA(subtotal)) {
			return 0;
		}
		return subtotal * vat;
	}

	private boolean noIVA(float subtotal) {
		return ((customer.getAge() < 18) ||
				(new GregorianCalendar().get(Calendar.YEAR) > year)
				|| (subtotal < 0.5f));
	}
}
