public class CreditPaymentService {

    public double percent;
    public double months;
    public double amount;

    public double calculate(double percent, double months, double amount) {
        double monthlyPercent = percent / 100 / 12;
        double monthlyPayment = amount * (monthlyPercent + monthlyPercent / (Math.pow(1 + monthlyPercent, months) - 1));
        return monthlyPayment;
    }
}
