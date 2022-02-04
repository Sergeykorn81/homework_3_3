public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int monthlyPayment = (int) service.calculate(9.99, 12, 1_000_000);
        System.out.println("Ваш ежемесячный платеж составит: " + monthlyPayment + " руб.");
        int monthlyPayment1 = (int) service.calculate(9.99, 24, 1_000_000);
        System.out.println("Ваш ежемесячный платеж составит: " + monthlyPayment1 + " руб.");
        int monthlyPayment2 = (int) service.calculate(9.99, 36, 1_000_000);
        System.out.println("Ваш ежемесячный платеж составит: " + monthlyPayment2 + " руб.");

    }
}
