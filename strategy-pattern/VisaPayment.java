public class VisaPayment implements CreditCardPayment {
    @Override
    public void pay() {
        System.out.println("Processing payment with Visa card");
    }
}