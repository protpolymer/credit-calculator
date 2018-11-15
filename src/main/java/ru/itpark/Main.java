package ru.itpark;

public class Main {
    public static void main(String[] args) {

        int sumCredit = 1_000_000;
        double rateYear = 13.75;
        int period = 60;

        CreditCalculatorService creditCalculatorService = new CreditCalculatorService();
        int credit = creditCalculatorService.paymentMonth(sumCredit, rateYear, period);
        int total = creditCalculatorService.totalPayments(sumCredit, rateYear, period);

        System.out.println(credit + " " + total);

    }
}
