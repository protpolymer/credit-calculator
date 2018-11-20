package ru.itpark;

public class CreditCalculatorService {
    public String amountCredit(int sumCredit, double rateYear, int period){

        double rateMonth = rateYear / (12 * 100);

        double coefAnnua = (rateMonth * Math.pow(1 + rateMonth, period) / (Math.pow(1 + rateMonth, period) - 1));
        double payment = coefAnnua * sumCredit;

        double credit = payment * period;

        String formattedDouble = String.format("%.2f", credit);
        return formattedDouble;

    }
}
