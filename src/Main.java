public class Main {

    public static void main(String[] args) {
    int months;
    int amount;
    double rate = 9.99;
    CreditPaymentService service = new CreditPaymentService();

    int monthPayment = service.calculate(1_000_000, 12, rate);
    System.out.println("Ежемесячный платеж по кредиту: " + monthPayment);

    int monthPayment1 = service.calculate(1_000_000, 24, rate);
    System.out.println("Ежемесячный платеж по кредиту: " + monthPayment1);

    int monthPayment2 = service.calculate(1_000_000, 36, rate);
    System.out.println("Ежемесячный платеж по кредиту: " + monthPayment2);
    }
}
