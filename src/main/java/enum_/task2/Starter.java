package enum_.task2;

public class Starter {

    static double amountRub = 5000;

    public static void main(String[] args) {

        System.out.println("rub -> usd: " + Currency.USD.convert(amountRub));
        System.out.println("rub -> eur: " + Currency.EUR.convert(amountRub));
        System.out.println("rub -> gbp: " + Currency.GBP.convert(amountRub));
        System.out.println("rub -> jpy: " + Currency.JPY.convert(amountRub));

    }
}
