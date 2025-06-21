public class CurrencyConverter {

    public double convert(double amount, String fromCurrency, String toCurrency) {
        fromCurrency = fromCurrency.toUpperCase();
        toCurrency = toCurrency.toUpperCase();

        double conversionRate = 0;

        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            conversionRate = 0.92;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
            conversionRate = 82.75;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            conversionRate = 1.08;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("INR")) {
            conversionRate = 89.65;
        } else if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
            conversionRate = 0.012;
        } else if (fromCurrency.equals("INR") && toCurrency.equals("EUR")) {
            conversionRate = 0.011;
        } else {
            throw new IllegalArgumentException("Invalid currency combination.");
        }

        return amount * conversionRate;
    }
}
