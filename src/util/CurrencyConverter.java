package util;

public class CurrencyConverter {
    public static double converter(double price, double dolarQuantity){
        double amountPaid = price * dolarQuantity;
        double tax = (amountPaid * 0.06);
        return amountPaid - tax;
    }
}
