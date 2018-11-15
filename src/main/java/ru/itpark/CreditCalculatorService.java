package ru.itpark;

public class CreditCalculatorService {
    public int paymentMonth(int sumCredit, double rateYear, int period){

        double rateMonth = rateYear / (12 * 100);

        double coefAnnua = (rateMonth * Math.pow(1 + rateMonth, period) / (Math.pow(1 + rateMonth, period) - 1));
        double payment = coefAnnua * sumCredit;

        return (int)Math.rint(payment);

    }

    public  int totalPayments(int sumCredit, double rateYear, int period) {
        double rateMonth = rateYear / (12 * 100);

        double coefAnnua = (rateMonth * Math.pow(1 + rateMonth, period) / (Math.pow(1 + rateMonth, period) - 1));
        double payment = coefAnnua * sumCredit;
        double total = payment * period;

        return  (int)Math.rint(total);
    }

}
