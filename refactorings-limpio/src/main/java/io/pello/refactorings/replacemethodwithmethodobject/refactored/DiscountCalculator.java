package io.pello.refactorings.replacemethodwithmethodobject.refactored;

public class DiscountCalculator {

    private double finalPrice;
    private double appliedVat;
    private double price;
    private Customer customer;
    private double discount;

    public DiscountCalculator(double price, Customer customer, double discount) {
        finalPrice = 0;
        appliedVat = 0;
        this.price = price;
        this.customer = customer;
        this.discount = discount;
    }

    public double calculateVat(double price, double discount) {

        switch (customer.getType()) {
            case Customer.NORMAL:
                return 1.21f;
   
            case Customer.SPECIAL:
                return 1.15f;
 
            case Customer.VIP:
                return 1.04f;

            default:
               return 1.21f;
        }

    }

    public double calculatePrice(double price1) {
        double finalPrice;
        if (price1 > 50 && customer.isVip()) {
            finalPrice = price1 * 0.5;
        } else if (price1 > 10 && customer.isSpecial()) {
            finalPrice = price1 * 0.1;
        } else {
            finalPrice = price1;
        }
        return finalPrice;
    }
}
