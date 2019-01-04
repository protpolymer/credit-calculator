package ru.itpark;


import java.math.BigDecimal;

public class CreditCalculatorService {
    public double amountCredit(int sumCredit, double rateYear, int period){

        double rateMonth = rateYear / (12 * 100);
        double coefAnnua = (rateMonth * Math.pow(1 + rateMonth, period) / (Math.pow(1 + rateMonth, period) - 1));
        double payment = coefAnnua * sumCredit;
        BigDecimal credit = new BigDecimal(payment * period);
        return credit.doubleValue();

    }
}
