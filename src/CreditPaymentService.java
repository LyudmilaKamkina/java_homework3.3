public class CreditPaymentService {
    public int calculate(int amount, int months, double rate) {
        int monthPayment;
        double monthRate = rate / (100 * 12);
        double annuityRatio = (monthRate * Math.pow((1 + monthRate), months)) / (Math.pow((1 + monthRate), months) - 1);
        monthPayment = (int) (amount * annuityRatio);
        return monthPayment;
    }
}
