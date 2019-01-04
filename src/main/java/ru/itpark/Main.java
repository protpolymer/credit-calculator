package ru.itpark;

public class Main {
    public static void main(String[] args) {

        int sumCredit = 1_000_000;
        double rateYear = 13.75;
        int period = 18;

        CreditCalculatorService creditCalculatorService = new CreditCalculatorService();
        double credit = creditCalculatorService.amountCredit(sumCredit, rateYear, period);

        System.out.println(credit);

    }
}
