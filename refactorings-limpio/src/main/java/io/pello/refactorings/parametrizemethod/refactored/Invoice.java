package io.pello.refactorings.parametrizemethod.refactored;

/**
 * Parametrized method This class is intended to be used as a refactoring
 * playground
 *
 * @author PELLO_ALTADILL
 */
public class Invoice {

    private float subtotal;
    private Customer customer;

    public Invoice(float subtotal, Customer customer) {
        this.subtotal = subtotal;
        this.customer = customer;
    }

    public float charge() {
        if (customer.getAge() < 18) {
            return charge(0.5f);
        } else if (customer.payInCash()) {
            return charge(0.8f);
        } else {
            return charge();
        }
    }

    public float charge(float discount) {
        return subtotal * discount;
    }
}
