package io.pello.refactorings.splittemporaryvariable.refactored;

/**
 * Avoid using temporary variable refactoring playground
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Invoice {
	public float totalPrice (float price, float vat, float discount) {
		float appliedVat = (vat*100)/price;
		System.out.println("Applied vat: " + appliedVat);
                
		float priceWithVat = price + appliedVat;
		System.out.println("Total with vat: " + priceWithVat);
		return priceWithVat - discount;
	}
}
