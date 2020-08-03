package entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double currencyConverter (double price, double dollars) {
        return price * dollars + (price * dollars * IOF);
    }
}
